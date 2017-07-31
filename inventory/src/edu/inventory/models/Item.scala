package edu.inventory.models

/**
  * Created by Neelaksh on 31/7/17.
  */
case class Item(itemId:Int,itemName:String,description:String, category:String,
           photos:List[Photo],vendorInfo:VenderInfo,price:Price,count:Int)
