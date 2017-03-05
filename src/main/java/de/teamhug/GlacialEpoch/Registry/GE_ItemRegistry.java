package de.teamhug.GlacialEpoch.Registry;

import cpw.mods.fml.common.registry.GameRegistry;
import de.teamhug.GlacialEpoch.Items.GE_Item;
import net.minecraft.item.Item;

/**
 * GlacialEpoch.git, Created by Henny on 03.03.2017.
 */
public class GE_ItemRegistry
{
    //Cadaver
	public static Item itemCadaverCow;
	
	//Tools
	public static Item itemHidesCutter;

	//BurnedForms
	public static Item itemBurnedFormArrowHead;
	public static Item itemBurnedFormAxeHead;
	public static Item itemBurnedFormBoard;
	public static Item itemBurnedFormBroadaxeHead;
	public static Item itemBurnedFormChiselHead;
	public static Item itemBurnedFormCrossbar;
	public static Item itemBurnedFormExcavator;
	public static Item itemBurnedFormFullGuard;
	public static Item itemBurnedFormHammerHead;
	public static Item itemBurnedFormIngot;
	public static Item itemBurnedFormKnifeBlade;
	public static Item itemBurnedFormLargeBlade;
	public static Item itemBurnedFormNugget;
	public static Item itemBurnedFormPan;
	public static Item itemBurnedFormPickaxeHead;
	public static Item itemBurnedFormPlate;
	public static Item itemBurnedFormRod;
	public static Item itemBurnedFormScytheHead;
	public static Item itemBurnedFormShovelHead;
	public static Item itemBurnedFormSwordBlade;
	public static Item itemBurnedFormToolBinding;
	public static Item itemBurnedFormToughBinding;	
	

	//CastingForms
	public static Item itemCastingFormArrowHead;
	public static Item itemCastingFormAxeHead;
	public static Item itemCastingFormBoard;
	public static Item itemCastingFormBroadaxeHead;
	public static Item itemCastingFormChiselHead;
	public static Item itemCastingFormCrossbar;
	public static Item itemCastingFormExcavator;
	public static Item itemCastingFormFullGuard;
	public static Item itemCastingFormHammerHead;
	public static Item itemCastingFormIngot;
	public static Item itemCastingFormKnifeBlade;
	public static Item itemCastingFormLargeBlade;
	public static Item itemCastingFormNugget;
	public static Item itemCastingFormPan;
	public static Item itemCastingFormPickaxeHead;
	public static Item itemCastingFormPlate;
	public static Item itemCastingFormRod;
	public static Item itemCastingFormScytheHead;
	public static Item itemCastingFormShovelHead;
	public static Item itemCastingFormSwordBlade;
	public static Item itemCastingFormToolBinding;
	public static Item itemCastingFormToughBinding;
	
	//Dummy
	public static Item itemDummyItem1;
    public static Item itemDummyItem2;
    
    public static void registerItems()
    {   
        //Cadaver
        itemCadaverCow = new GE_Item("GE_itemCadaverCow");
        itemCadaverCow.setMaxStackSize(64);
        GameRegistry.registerItem(itemCadaverCow, "GE_itemCadaverCow");
        

        //Tools
        itemHidesCutter = new GE_Item("GE_itemHidesCutter");
        itemHidesCutter.setMaxStackSize(1);
        GameRegistry.registerItem(itemHidesCutter, "GE_itemHidesCutter");

        //BurnedForms
    	itemBurnedFormArrowHead = new GE_Item("GE_itemBurnedFormArrowHead");
    	itemBurnedFormArrowHead.setMaxStackSize(1);
        GameRegistry.registerItem(itemBurnedFormArrowHead, "GE_itemBurnedFormArrowHead");
        
        itemBurnedFormAxeHead = new GE_Item("GE_itemBurnedFormAxeHead");
        itemBurnedFormAxeHead.setMaxStackSize(1);
        GameRegistry.registerItem(itemBurnedFormAxeHead, "GE_itemBurnedFormAxeHead");
        
        itemBurnedFormBoard = new GE_Item("GE_itemBurnedFormBoard");
        itemBurnedFormBoard.setMaxStackSize(1);
        GameRegistry.registerItem(itemBurnedFormBoard, "GE_itemBurnedFormBoard");
        
        itemBurnedFormBroadaxeHead = new GE_Item("GE_itemBurnedFormBroadaxeHead");
        itemBurnedFormBroadaxeHead.setMaxStackSize(1);
        GameRegistry.registerItem(itemBurnedFormBroadaxeHead, "GE_itemBurnedFormBroadaxeHead");
        
        itemBurnedFormChiselHead = new GE_Item("GE_itemBurnedFormChiselHead");
        itemBurnedFormChiselHead.setMaxStackSize(1);
        GameRegistry.registerItem(itemBurnedFormChiselHead, "GE_itemBurnedFormChiselHead");
        
        itemBurnedFormCrossbar = new GE_Item("GE_itemBurnedFormCrossbar");
        itemBurnedFormCrossbar.setMaxStackSize(1);
        GameRegistry.registerItem(itemBurnedFormCrossbar, "GE_itemBurnedFormCrossbar");
        
        itemBurnedFormExcavator = new GE_Item("GE_itemBurnedFormExcavator");
        itemBurnedFormExcavator.setMaxStackSize(1);
        GameRegistry.registerItem(itemBurnedFormExcavator, "GE_itemBurnedFormExcavator");
        
        itemBurnedFormFullGuard = new GE_Item("GE_itemBurnedFormFullGuard");
        itemBurnedFormFullGuard.setMaxStackSize(1);
        GameRegistry.registerItem(itemBurnedFormFullGuard, "GE_itemBurnedFormFullGuard");
        
        itemBurnedFormHammerHead = new GE_Item("GE_itemBurnedFormHammerHead");
        itemBurnedFormHammerHead.setMaxStackSize(1);
        GameRegistry.registerItem(itemBurnedFormHammerHead, "GE_itemBurnedFormHammerHead");
        
        itemBurnedFormIngot = new GE_Item("GE_itemBurnedFormIngot");
        itemBurnedFormIngot.setMaxStackSize(1);
        GameRegistry.registerItem(itemBurnedFormIngot, "GE_itemBurnedFormIngot");
        
        itemBurnedFormKnifeBlade = new GE_Item("GE_itemBurnedFormKnifeBlade");
        itemBurnedFormKnifeBlade.setMaxStackSize(1);
        GameRegistry.registerItem(itemBurnedFormKnifeBlade, "GE_itemBurnedFormKnifeBlade");
        
        itemBurnedFormLargeBlade = new GE_Item("GE_itemBurnedFormLargeBlade");
        itemBurnedFormLargeBlade.setMaxStackSize(1);
        GameRegistry.registerItem(itemBurnedFormLargeBlade, "GE_itemBurnedFormLargeBlade");
        
        itemBurnedFormNugget = new GE_Item("GE_itemBurnedFormNugget");
        itemBurnedFormNugget.setMaxStackSize(1);
        GameRegistry.registerItem(itemBurnedFormNugget, "GE_itemBurnedFormNugget");
        
        itemBurnedFormPan = new GE_Item("GE_itemBurnedFormPan");
        itemBurnedFormPan.setMaxStackSize(1);
        GameRegistry.registerItem(itemBurnedFormPan, "GE_itemBurnedFormPan");
        
        itemBurnedFormPickaxeHead = new GE_Item("GE_itemBurnedFormPickaxeHead");
        itemBurnedFormPickaxeHead.setMaxStackSize(1);
        GameRegistry.registerItem(itemBurnedFormPickaxeHead, "GE_itemBurnedFormPickaxeHead");
        
        itemBurnedFormPlate = new GE_Item("GE_itemBurnedFormPlate");
        itemBurnedFormPlate.setMaxStackSize(1);
        GameRegistry.registerItem(itemBurnedFormPlate, "GE_itemBurnedFormPlate");
        
        itemBurnedFormRod = new GE_Item("GE_itemBurnedFormRod");
        itemBurnedFormRod.setMaxStackSize(1);
        GameRegistry.registerItem(itemBurnedFormRod, "GE_itemBurnedFormRod");
        
        itemBurnedFormScytheHead = new GE_Item("GE_itemBurnedFormScytheHead");
        itemBurnedFormScytheHead.setMaxStackSize(1);
        GameRegistry.registerItem(itemBurnedFormScytheHead, "GE_itemBurnedFormScytheHead");
        
        itemBurnedFormShovelHead = new GE_Item("GE_itemBurnedFormShovelHead");
        itemBurnedFormShovelHead.setMaxStackSize(1);
        GameRegistry.registerItem(itemBurnedFormShovelHead, "GE_itemBurnedFormShovelHead");
        
        itemBurnedFormSwordBlade = new GE_Item("GE_itemBurnedFormSwordBlade");
        itemBurnedFormSwordBlade.setMaxStackSize(1);
        GameRegistry.registerItem(itemBurnedFormSwordBlade, "GE_itemBurnedFormSwordBlade");
        
        itemBurnedFormToolBinding = new GE_Item("GE_itemBurnedFormToolBinding");
        itemBurnedFormToolBinding.setMaxStackSize(1);
        GameRegistry.registerItem(itemBurnedFormToolBinding, "GE_itemBurnedFormToolBinding");
        
        itemBurnedFormToughBinding = new GE_Item("GE_itemBurnedFormToughBinding");
        itemBurnedFormToughBinding.setMaxStackSize(1);
        GameRegistry.registerItem(itemBurnedFormToughBinding, "GE_itemBurnedFormToughBinding");
        
        //CastingForms
    	itemCastingFormArrowHead = new GE_Item("GE_itemCastingFormArrowHead");
    	itemCastingFormArrowHead.setMaxStackSize(1);
        GameRegistry.registerItem(itemCastingFormArrowHead, "GE_itemCastingFormArrowHead");
        
        itemCastingFormAxeHead = new GE_Item("GE_itemCastingFormAxeHead");
        itemCastingFormAxeHead.setMaxStackSize(1);
        GameRegistry.registerItem(itemCastingFormAxeHead, "GE_itemCastingFormAxeHead");
        
        itemCastingFormBoard = new GE_Item("GE_itemCastingFormBoard");
        itemCastingFormBoard.setMaxStackSize(1);
        GameRegistry.registerItem(itemCastingFormBoard, "GE_itemCastingFormBoard");
        
        itemCastingFormBroadaxeHead = new GE_Item("GE_itemCastingFormBroadaxeHead");
        itemCastingFormBroadaxeHead.setMaxStackSize(1);
        GameRegistry.registerItem(itemCastingFormBroadaxeHead, "GE_itemCastingFormBroadaxeHead");
        
        itemCastingFormChiselHead = new GE_Item("GE_itemCastingFormChiselHead");
        itemCastingFormChiselHead.setMaxStackSize(1);
        GameRegistry.registerItem(itemCastingFormChiselHead, "GE_itemCastingFormChiselHead");
        
        itemCastingFormCrossbar = new GE_Item("GE_itemCastingFormCrossbar");
        itemCastingFormCrossbar.setMaxStackSize(1);
        GameRegistry.registerItem(itemCastingFormCrossbar, "GE_itemCastingFormCrossbar");
        
        itemCastingFormExcavator = new GE_Item("GE_itemCastingFormExcavator");
        itemCastingFormExcavator.setMaxStackSize(1);
        GameRegistry.registerItem(itemCastingFormExcavator, "GE_itemCastingFormExcavator");
        
        itemCastingFormFullGuard = new GE_Item("GE_itemCastingFormFullGuard");
        itemCastingFormFullGuard.setMaxStackSize(1);
        GameRegistry.registerItem(itemCastingFormFullGuard, "GE_itemCastingFormFullGuard");
        
        itemCastingFormHammerHead = new GE_Item("GE_itemCastingFormHammerHead");
        itemCastingFormHammerHead.setMaxStackSize(1);
        GameRegistry.registerItem(itemCastingFormHammerHead, "GE_itemCastingFormHammerHead");
        
        itemCastingFormIngot = new GE_Item("GE_itemCastingFormIngot");
        itemCastingFormIngot.setMaxStackSize(1);
        GameRegistry.registerItem(itemCastingFormIngot, "GE_itemCastingFormIngot");
        
        itemCastingFormKnifeBlade = new GE_Item("GE_itemCastingFormKnifeBlade");
        itemCastingFormKnifeBlade.setMaxStackSize(1);
        GameRegistry.registerItem(itemCastingFormKnifeBlade, "GE_itemCastingFormKnifeBlade");
        
        itemCastingFormLargeBlade = new GE_Item("GE_itemCastingFormLargeBlade");
        itemCastingFormLargeBlade.setMaxStackSize(1);
        GameRegistry.registerItem(itemCastingFormLargeBlade, "GE_itemCastingFormLargeBlade");
        
        itemCastingFormNugget = new GE_Item("GE_itemCastingFormNugget");
        itemCastingFormNugget.setMaxStackSize(1);
        GameRegistry.registerItem(itemCastingFormNugget, "GE_itemCastingFormNugget");
        
        itemCastingFormPan = new GE_Item("GE_itemCastingFormPan");
        itemCastingFormPan.setMaxStackSize(1);
        GameRegistry.registerItem(itemCastingFormPan, "GE_itemCastingFormPan");
        
        itemCastingFormPickaxeHead = new GE_Item("GE_itemCastingFormPickaxeHead");
        itemCastingFormPickaxeHead.setMaxStackSize(1);
        GameRegistry.registerItem(itemCastingFormPickaxeHead, "GE_itemCastingFormPickaxeHead");
        
        itemCastingFormPlate = new GE_Item("GE_itemCastingFormPlate");
        itemCastingFormPlate.setMaxStackSize(1);
        GameRegistry.registerItem(itemCastingFormPlate, "GE_itemCastingFormPlate");
        
        itemCastingFormRod = new GE_Item("GE_itemCastingFormRod");
        itemCastingFormRod.setMaxStackSize(1);
        GameRegistry.registerItem(itemCastingFormRod, "GE_itemCastingFormRod");
        
        itemCastingFormScytheHead = new GE_Item("GE_itemCastingFormScytheHead");
        itemCastingFormScytheHead.setMaxStackSize(1);
        GameRegistry.registerItem(itemCastingFormScytheHead, "GE_itemCastingFormScytheHead");
        
        itemCastingFormShovelHead = new GE_Item("GE_itemCastingFormShovelHead");
        itemCastingFormShovelHead.setMaxStackSize(1);
        GameRegistry.registerItem(itemCastingFormShovelHead, "GE_itemCastingFormShovelHead");
        
        itemCastingFormSwordBlade = new GE_Item("GE_itemCastingFormSwordBlade");
        itemCastingFormSwordBlade.setMaxStackSize(1);
        GameRegistry.registerItem(itemCastingFormSwordBlade, "GE_itemCastingFormSwordBlade");
        
        itemCastingFormToolBinding = new GE_Item("GE_itemCastingFormToolBinding");
        itemCastingFormToolBinding.setMaxStackSize(1);
        GameRegistry.registerItem(itemCastingFormToolBinding, "GE_itemCastingFormToolBinding");
        
        itemCastingFormToughBinding = new GE_Item("GE_itemCastingFormToughBinding");
        itemCastingFormToughBinding.setMaxStackSize(1);
        GameRegistry.registerItem(itemCastingFormToughBinding, "GE_itemCastingFormToughBinding");
        
        
    	//Dummy
        itemDummyItem1 = new GE_Item("GE_itemDummyItem1");
        GameRegistry.registerItem(itemDummyItem1, "GE_itemDummyItem1");

        itemDummyItem2 = new GE_Item("GE_itemDummyItem2");
        itemDummyItem2.setMaxStackSize(16);
        GameRegistry.registerItem(itemDummyItem2, "GE_itemDummyItem2");
        
    }
}
