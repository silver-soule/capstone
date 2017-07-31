package edu.knoldus
import edu.inventory.models.{Inventory, Item, Price}
import scala.collection.mutable.Map
import scala.concurrent.Future
/**
  * Created by Neelaksh on 31/7/17.
  */
object InventoryDatabase extends Inventory{

  override val inventory: Map[Item,Int] = Map()

  def getPriceById(itemId:Int):Future[Option[Price]] = {
    Future {
      inventory.find(_._1.itemId == itemId).map(item => item._1.price)
    }
  }

/*  def removeItems(itemId:Int,reduceBy:Int) = {
    Future{
      if(inventory.get)
    }
  }*/

  def addItems(item:Item,count:Int):Future[Int] = {
    Future {
      inventory+=(item->count)
      item.itemId
    }
  }
}
