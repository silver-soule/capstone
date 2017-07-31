package edu.knoldus.Service

import edu.inventory.models._
import edu.knoldus.InventoryDatabase
/**
  * Created by Neelaksh on 31/7/17.
  */
class BackEnd {

  def sortedInventory(category:String,itemName:String,condition:String): List[(Item,Int)] = {
    val category = InventoryDatabase.inventory.filterKeys(_.category == category).toList
    condition match{
      case "htol" => category.sortWith((x,y)=>x._1.price.price > y._1.price.price)
      case "ltoh" => category.sortWith((x,y)=>x._1.price.price < y._1.price.price)
      case _ => category
    }
  }


}
