package subaraki.exsartagine.item;

import static lib.item.ItemRegistry.registerItem;
import static lib.item.ItemRegistry.registerRender;

import com.mojang.realmsclient.gui.ChatFormatting;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import subaraki.exsartagine.block.ExSartagineBlock;
import subaraki.exsartagine.mod.ExSartagine;

public class ExSartagineItems {

	public static Item pan;
	public static Item smelter;
	public static Item pot;
	public static Item range;

	public static ItemFood boiled_egg;
	public static ItemFood boiled_beans;
	public static ItemFood boiled_potato;
	
	public static ItemFood pizza_plain;
	
	public static ItemFood pizza_meat;
	public static ItemFood pizza_chicken;
	public static ItemFood pizza_fish;
	public static ItemFood pizza_sweet;
	
	public static ItemFood pizza_meat_raw;
	public static ItemFood pizza_chicken_raw;
	public static ItemFood pizza_fish_raw;
	public static ItemFood pizza_sweet_raw;
	
	public static ItemFood bread_fine;
	public static ItemFood bread_meat;
	public static ItemFood bread_veggie;
	
	public static ItemFood bread_meat_raw;
	public static ItemFood bread_veggie_raw;
	
	public static Item pizza_dough;
	public static Item bread_dough;

	public static Item dough;
	public static Item salt;
	public static Item yeast;
	public static Item curd;
	public static Item flour;

	public static CreativeTabs foods = new CreativeTabs("exsartaginefoods") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(pizza_plain);
		}
	};
	
	public static CreativeTabs pots = new CreativeTabs("potsnpans") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(range);
		}
	};
	public static void load(){
		pan = new ItemBlock(ExSartagineBlock.pan).setRegistryName(ExSartagineBlock.pan.getRegistryName());
		smelter = new ItemBlock(ExSartagineBlock.smelter).setRegistryName(ExSartagineBlock.smelter.getRegistryName());
		pot = new ItemBlock(ExSartagineBlock.pot).setRegistryName(ExSartagineBlock.pot.getRegistryName());
		range = new ItemBlock(ExSartagineBlock.range).setRegistryName(ExSartagineBlock.range.getRegistryName());

		boiled_egg = (ItemFood) new ItemFood(4, 0.5f, false).setCreativeTab(CreativeTabs.FOOD).setUnlocalizedName(ExSartagine.MODID+".egg.boiled").setRegistryName("egg.boiled");
		boiled_beans = (ItemFood) new ItemFood(3, 0.2f,false).setCreativeTab(CreativeTabs.FOOD).setUnlocalizedName(ExSartagine.MODID+".beans.boiled").setRegistryName("beans.boiled");
		boiled_potato = (ItemFood) new ItemFood(6, 0.5f,false).setCreativeTab(CreativeTabs.FOOD).setUnlocalizedName(ExSartagine.MODID+".potato.boiled").setRegistryName("potato.boiled");

		flour = new Item().setCreativeTab(CreativeTabs.FOOD).setUnlocalizedName(ExSartagine.MODID+".flour").setRegistryName("flour");
		salt = new Item().setCreativeTab(CreativeTabs.FOOD).setUnlocalizedName(ExSartagine.MODID+".salt").setRegistryName("salt");
		yeast = new Item().setCreativeTab(CreativeTabs.FOOD).setUnlocalizedName(ExSartagine.MODID+".yeast").setRegistryName("yeast");
		curd = new Item(){
			public void addInformation(net.minecraft.item.ItemStack stack, net.minecraft.entity.player.EntityPlayer playerIn, java.util.List<String> tooltip, boolean advanced) {
				String text = ChatFormatting.ITALIC + "Simple Cheese";
				
				if(!tooltip.contains(text))
					tooltip.add(text);
			};
		}.setCreativeTab(CreativeTabs.FOOD).setUnlocalizedName(ExSartagine.MODID+".curd").setRegistryName("curd").setCreativeTab(foods);
		dough = new Item().setCreativeTab(CreativeTabs.FOOD).setUnlocalizedName(ExSartagine.MODID+".dough").setRegistryName("dough").setCreativeTab(foods);
		bread_dough = new Item().setCreativeTab(CreativeTabs.FOOD).setUnlocalizedName(ExSartagine.MODID+".doughBread").setRegistryName("doughBread").setCreativeTab(foods);
		pizza_dough = new Item().setCreativeTab(CreativeTabs.FOOD).setUnlocalizedName(ExSartagine.MODID+".doughPizza").setRegistryName("doughPizza").setCreativeTab(foods);
				
		pizza_plain = (ItemFood)new ItemFood(6, 0.6f, false).setUnlocalizedName(ExSartagine.MODID+".pizzaPlain").setRegistryName("pizzaPlain").setCreativeTab(foods);
		
		pizza_meat = (ItemFood)new ItemFood(12, 0.9f, false).setUnlocalizedName(ExSartagine.MODID+".pizzaMeat").setRegistryName("pizzaMeat").setCreativeTab(foods);
		pizza_chicken = (ItemFood)new ItemFood(10, 0.9f, false).setUnlocalizedName(ExSartagine.MODID+".pizzaChicken").setRegistryName("pizzaChicken").setCreativeTab(foods);
		pizza_sweet = (ItemFood)new ItemFood(10, 0.7f, false).setUnlocalizedName(ExSartagine.MODID+".pizzaSweet").setRegistryName("pizzaSweet").setCreativeTab(foods);
		pizza_fish = (ItemFood)new ItemFood(9, 1.0f, false).setUnlocalizedName(ExSartagine.MODID+".pizzaFish").setRegistryName("pizzaFish").setCreativeTab(foods);

		pizza_meat_raw = (ItemFood)new ItemFood(4, 0.3f, false).setUnlocalizedName(ExSartagine.MODID+".pizzaMeatRaw").setRegistryName("pizzaMeatRaw").setCreativeTab(foods);
		pizza_chicken_raw = (ItemFood)new ItemFood(3, 0.3f, false).setUnlocalizedName(ExSartagine.MODID+".pizzaChickenRaw").setRegistryName("pizzaChickenRaw").setCreativeTab(foods);
		pizza_sweet_raw = (ItemFood)new ItemFood(3, 0.2f, false).setUnlocalizedName(ExSartagine.MODID+".pizzaSweetRaw").setRegistryName("pizzaSweetRaw").setCreativeTab(foods);
		pizza_fish_raw = (ItemFood)new ItemFood(2, 0.4f, false).setUnlocalizedName(ExSartagine.MODID+".pizzaFishRaw").setRegistryName("pizzaFishRaw").setCreativeTab(foods);

		bread_fine = (ItemFood)new ItemFood(5, 0.8f, false).setUnlocalizedName(ExSartagine.MODID+".breadFine").setRegistryName("breadFine").setCreativeTab(foods);
		bread_meat = (ItemFood)new ItemFood(4, 0.45f, false).setUnlocalizedName(ExSartagine.MODID+".breadMeat").setRegistryName("breadMeat").setCreativeTab(foods);
		bread_veggie = (ItemFood)new ItemFood(8, 0.9f, false).setUnlocalizedName(ExSartagine.MODID+".breadVeggie").setRegistryName("breadVeggie").setCreativeTab(foods);

		bread_meat_raw = (ItemFood)new ItemFood(2, 0.3f, false).setUnlocalizedName(ExSartagine.MODID+".breadMeatRaw").setRegistryName("breadMeatRaw").setCreativeTab(foods);
		bread_veggie_raw = (ItemFood)new ItemFood(3, 0.3f, false).setUnlocalizedName(ExSartagine.MODID+".breadVeggieRaw").setRegistryName("breadVeggieRaw").setCreativeTab(foods);
		
		register();
		
		addToOreDict();
	}

	private static void addToOreDict() {
		OreDictionary.registerOre("egg", boiled_egg);
		OreDictionary.registerOre("ingredientEgg", boiled_egg);
		OreDictionary.registerOre("cropVegetable", boiled_potato);
		OreDictionary.registerOre("cropVegetable", boiled_beans);
		
		OreDictionary.registerOre("foodFlour", flour);
		OreDictionary.registerOre("dustSalt", salt);
		OreDictionary.registerOre("itemCheese", curd);
		OreDictionary.registerOre("ingredientCheese", curd);
		OreDictionary.registerOre("itemYeast", yeast);
		OreDictionary.registerOre("foodDough", dough);
		OreDictionary.registerOre("foodDoughFlat", pizza_dough);
		OreDictionary.registerOre("foodDoughBread", bread_dough); //food registry for pan slot

	}

	private static void register() {
		registerItem(pan);	
		registerItem(smelter);	
		registerItem(pot);	
		registerItem(range);	
		
		registerItem(boiled_egg);
		registerItem(boiled_beans);
		registerItem(boiled_potato);
		
		registerItem(salt);
		registerItem(flour);
		registerItem(curd);
		registerItem(yeast);
		registerItem(dough);
		
		registerItem(pizza_plain);
		registerItem(pizza_chicken);
		registerItem(pizza_chicken_raw);
		registerItem(pizza_fish);
		registerItem(pizza_fish_raw);
		registerItem(pizza_meat);
		registerItem(pizza_meat_raw);
		registerItem(pizza_sweet);
		registerItem(pizza_sweet_raw);
		registerItem(pizza_dough);
		
		registerItem(bread_dough);
		registerItem(bread_fine);
		registerItem(bread_meat);
		registerItem(bread_meat_raw);
		registerItem(bread_veggie);
		registerItem(bread_veggie_raw);
		
	}

	public static void registerRenders(){
		registerRender(pan, "pan", ExSartagine.MODID);
		registerRender(smelter, "smelter", ExSartagine.MODID);
		registerRender(pot, "pot", ExSartagine.MODID);
		registerRender(range, "range", ExSartagine.MODID);

		registerRender(boiled_egg, "egg", ExSartagine.MODID);
		registerRender(boiled_beans, "beans", ExSartagine.MODID);
		registerRender(boiled_potato, "potato", ExSartagine.MODID);
		
		registerRender(pizza_plain, "pizza_plain", ExSartagine.MODID);

		registerRender(pizza_chicken, "pizza_chicken_cooked", ExSartagine.MODID);
		registerRender(pizza_sweet, "pizza_sweet_cooked", ExSartagine.MODID);
		registerRender(pizza_meat, "pizza_meat_cooked", ExSartagine.MODID);
		registerRender(pizza_fish, "pizza_fish_cooked", ExSartagine.MODID);

		registerRender(pizza_chicken_raw, "pizza_chicken_raw", ExSartagine.MODID);
		registerRender(pizza_sweet_raw, "pizza_sweet_raw", ExSartagine.MODID);
		registerRender(pizza_meat_raw, "pizza_meat_raw", ExSartagine.MODID);
		registerRender(pizza_fish_raw, "pizza_fish_raw", ExSartagine.MODID);
		
		registerRender(bread_fine, "fine_bread", ExSartagine.MODID);
		registerRender(bread_meat, "meat_minibread", ExSartagine.MODID);
		registerRender(bread_veggie, "veggie_bread", ExSartagine.MODID);
		
		registerRender(bread_meat_raw, "meat_minibread_raw", ExSartagine.MODID);
		registerRender(bread_veggie_raw, "veggie_bread_raw", ExSartagine.MODID);
		
		registerRender(pizza_dough, "dough", ExSartagine.MODID);
		registerRender(bread_dough, "dough", ExSartagine.MODID);
		registerRender(dough, "dough", ExSartagine.MODID);
		registerRender(salt, "salt", ExSartagine.MODID);
		registerRender(flour, "flour", ExSartagine.MODID);
		registerRender(yeast, "yeast", ExSartagine.MODID);
		registerRender(curd, "curd", ExSartagine.MODID);
	}
}
