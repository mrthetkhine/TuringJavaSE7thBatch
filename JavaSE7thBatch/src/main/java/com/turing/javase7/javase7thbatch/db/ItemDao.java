/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.turing.javase7.javase7thbatch.db;


import com.turing.javase7.javase7thbatch.movieapp.dao.impl.DAO;
import com.turing.javase7.javase7thbatch.db.model.Item;
import com.turing.javase7.javase7thbatch.db.model.Section;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author macbook
 */
public class ItemDao{
    DAO dao = DAO.getSingelton();
    Connection con = dao.getConnection();
    ArrayList<Item> getAllItem()
    {
        ArrayList<Item> items = new ArrayList<>();
        
        String sql = "SELECT * FROM items;";
        
        try(Statement statement = con.createStatement())
        {
            ResultSet resultSet = statement.executeQuery(sql);
            
            while(resultSet.next())
            {
                int id = resultSet.getInt("Id");
                String name = resultSet.getString("name");
                String category = resultSet.getString("category");//3
                float price = resultSet.getFloat("price");//4
                int qty = resultSet.getInt("qty");
                        
                items.add(new Item(id,name,category,price,qty));
            }
            resultSet.close();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return items;
    }
    boolean saveItem(Item item)
    {
        
        String sql = "INSERT INTO items(name,category,price,qty) "
                + "VALUES(?,?,?,?);";
       
        try( PreparedStatement stmt = con.prepareStatement(sql);)
        {
           stmt.setString(1, item.name());
           stmt.setString(2,item.category());
           stmt.setFloat(3, item.price());
           stmt.setInt(4, item.qty());
            
           int row = stmt.executeUpdate();
           return row > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
           
        }
        return false;
    }
    boolean updateItem(Item item)
    {
        
        String sql = "UPDATE items "
                + "SET name =?, category = ? , price= ?, qty = ? "
                + "WHERE id=? ";
       
        try( PreparedStatement stmt = con.prepareStatement(sql);)
        {
           stmt.setString(1, item.name());
           stmt.setString(2,item.category());
           stmt.setFloat(3, item.price());
           stmt.setInt(4, item.qty());
           stmt.setInt(5, item.id());
            
           int row = stmt.executeUpdate();
           return row > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
           
        }
        return false;
    }
    boolean deleteItemBy(int id)
    {
        
        String sql = "DELETE FROM items "
                + "WHERE id=? ";
       
        try( PreparedStatement stmt = con.prepareStatement(sql);)
        {
           stmt.setInt(1, id);
           
            
           int row = stmt.executeUpdate();
           return row > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
           
        }
        return false;
    }
    ArrayList<Pair<Item,Section>> getItemAndSection()
    {
        ArrayList<Pair<Item,Section>> data = new ArrayList<>();
        String sql = """
                     SELECT items.id,items.name,section.id as sectionID, section.name AS sectionName FROM items 
                     JOIN item_section 
                     ON item_section.item_id = items.id
                     JOIN section
                     ON item_section.section_id = section.id;
                     """;
        try( PreparedStatement stmt = con.prepareStatement(sql);)
        {
           ResultSet result = stmt.executeQuery();
           
           while(result.next())
           {
               int itemId = result.getInt("id");
               String itemName = result.getString("name");
               int sectionId = result.getInt("sectionId");
               String sectionName = result.getString("sectionName");
               
               Item item= new Item(itemId,itemName,null,0,0);
               Section section = new Section(sectionId,sectionName);
               
               var pair = new Pair<Item,Section>(item,section);
               data.add(pair);
               
           }
        } catch (SQLException ex) {
            ex.printStackTrace();
           
        }
        return data;
    }
    public static void main(String[] args) {
        ItemDao itemDao = new ItemDao();
        /*
        ArrayList<Item> items = itemDao.getAllItem();
        
        items.forEach(System.out::println);
        */
        /*
        Item newItem = new Item(8,"Pineapple","Fruit",12.3F,100);
        //boolean result = itemDao.updateItem(newItem);
        boolean result = itemDao.deleteItemBy(9);
        System.out.println("Success "+result);
        */
        var items = itemDao.getItemAndSection();
        
        items.forEach(data->{
            System.out.println("item "+data.getFirst()+" section "+data.getSecond());
        });
    }
}
