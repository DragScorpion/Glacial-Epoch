package de.teamhug.GlacialEpoch.Registry;

import cpw.mods.fml.common.registry.GameRegistry;
import de.teamhug.GlacialEpoch.Items.GE_Item;
import de.teamhug.GlacialEpoch.Util.GE_CreativeTabs;
import net.minecraft.item.Item;

/**
 * GlacialEpoch.git, Created by Henny on 03.03.2017.
 */
public class GE_ItemButcherMod {

	//Butcher
		//Cow
		public static Item itemCadaverCow;		//Kuhk�rper
		public static Item itemBovine_half; 	//Rinderh�lfte
		public static Item itemBovine_skin; 	//Rinderhaut
		public static Item itemCowHead; 		//Kuhkopf
		
		//Sheep
		public static Item itemCadaverSheep;    //SchafK�rper
		public static Item itemSheepSkin;     	//Schafhaut
		public static Item itemSheepHead;		//Schafkopf
		public static Item itemSheepHalf;		//Schafh�lfte

		//ButcherTools
		public static Item itemHidesCutter;		//H�utemesser
		public static Item itemCuttingKnife;	//Stechmesser
		public static Item itemSlaughteringAx; 	//Schlachterbeil
		public static Item itemButchersKnife;	//Schlachtermesser
		
		public static void registerItem()
		{
			//Cow
	        itemCadaverCow = new GE_Item("GE_itemCadaverCow");
	        itemCadaverCow.setMaxStackSize(64);
	        itemCadaverCow.setCreativeTab(GE_CreativeTabs.tabGEButcher);
	        GameRegistry.registerItem(itemCadaverCow, "GE_itemCadaverCow");
	        
	        itemBovine_half = new GE_Item("GE_itemBovine_half");
	        itemBovine_half.setMaxStackSize(64);
	        itemBovine_half.setCreativeTab(GE_CreativeTabs.tabGEButcher);
	        GameRegistry.registerItem(itemBovine_half, "itemBovine_half");
	        
	        itemBovine_skin = new GE_Item("GE_itemBovine_skin");
	        itemBovine_skin.setMaxStackSize(64);
	        itemBovine_skin.setCreativeTab(GE_CreativeTabs.tabGEButcher);
	        GameRegistry.registerItem(itemBovine_skin, "itemBovine_skin");
	        
	        itemCowHead = new GE_Item("GE_itemCowHead");
	        itemCowHead.setMaxStackSize(64);
	        itemCowHead.setCreativeTab(GE_CreativeTabs.tabGEButcher);
	        GameRegistry.registerItem(itemCowHead, "itemCowHead");
	        
	        //Sheep
	        
	        itemCadaverSheep = new GE_Item("GE_itemCadaverSheep");
	        itemCadaverSheep.setMaxStackSize(64);
	        itemCadaverSheep.setCreativeTab(GE_CreativeTabs.tabGEButcher);
	        GameRegistry.registerItem(itemCadaverSheep, "GE_itemCadaverSheep");
	        
	        itemSheepHead = new GE_Item("GE_itemSheepHead");
	        itemSheepHead.setMaxStackSize(64);
	        itemSheepHead.setCreativeTab(GE_CreativeTabs.tabGEButcher);
	        GameRegistry.registerItem(itemSheepHead, "GE_itemSheepHead");
	        
	        itemSheepHalf = new GE_Item("GE_itemSheepHalf");
	        itemSheepHalf.setMaxStackSize(64);
	        itemSheepHalf.setCreativeTab(GE_CreativeTabs.tabGEButcher);
	        GameRegistry.registerItem(itemSheepHalf, "GE_itemSheepHalf");
	        
	        itemSheepSkin = new GE_Item("GE_itemSheepSkin");
	        itemSheepSkin.setMaxStackSize(64);
	        itemSheepSkin.setCreativeTab(GE_CreativeTabs.tabGEButcher);
	        GameRegistry.registerItem(itemSheepSkin, "GE_itemSheepSkin");
	        
	        
	        

	        //ButcherTools
	        itemHidesCutter = new GE_Item("GE_itemHidesCutter");
	        itemHidesCutter.setMaxStackSize(1);
	        itemHidesCutter.setCreativeTab(GE_CreativeTabs.tabGEButcher);
	        GameRegistry.registerItem(itemHidesCutter, "GE_itemHidesCutter");
	        
	        itemCuttingKnife = new GE_Item("GE_itemCuttingKnife");
	        itemCuttingKnife.setMaxStackSize(1);
	        itemCuttingKnife.setCreativeTab(GE_CreativeTabs.tabGEButcher);
	        GameRegistry.registerItem(itemCuttingKnife, "GE_itemCuttingKnife");
	        
	        itemSlaughteringAx = new GE_Item("GE_itemSlaughteringAx");
	        itemSlaughteringAx.setMaxStackSize(1);
	        itemSlaughteringAx.setCreativeTab(GE_CreativeTabs.tabGEButcher);
	        GameRegistry.registerItem(itemSlaughteringAx, "GE_itemSlaughteringAx");
	        
	        itemButchersKnife = new GE_Item("GE_itemButchersKnife");
	        itemButchersKnife.setMaxStackSize(1);
	        itemButchersKnife.setCreativeTab(GE_CreativeTabs.tabGEButcher);
	        GameRegistry.registerItem(itemButchersKnife, "GE_itemButchersKnife");
		}
}
