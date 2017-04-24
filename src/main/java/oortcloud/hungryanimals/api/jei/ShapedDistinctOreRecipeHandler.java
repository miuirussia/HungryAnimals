package oortcloud.hungryanimals.api.jei;

import mezz.jei.api.IJeiHelpers;
import mezz.jei.api.recipe.IRecipeHandler;
import mezz.jei.api.recipe.IRecipeWrapper;
import mezz.jei.api.recipe.VanillaRecipeCategoryUid;
import oortcloud.hungryanimals.recipes.ShapedDistinctOreRecipe;

public class ShapedDistinctOreRecipeHandler implements IRecipeHandler<ShapedDistinctOreRecipe> {

	private IJeiHelpers jeiHelpers;
	
	public ShapedDistinctOreRecipeHandler(IJeiHelpers jeiHelpers) {
		this.jeiHelpers = jeiHelpers;
	}
	
	@Override
	public Class<ShapedDistinctOreRecipe> getRecipeClass() {
		return ShapedDistinctOreRecipe.class;
	}

	@Override
	public String getRecipeCategoryUid() {
		return VanillaRecipeCategoryUid.CRAFTING;
	}

	@Override
	public String getRecipeCategoryUid(ShapedDistinctOreRecipe recipe) {
		return VanillaRecipeCategoryUid.CRAFTING;
	}

	@Override
	public IRecipeWrapper getRecipeWrapper(ShapedDistinctOreRecipe recipe) {
		return new ShapedDistinctOreRecipeWrapper(jeiHelpers, recipe);
	}

	@Override
	public boolean isRecipeValid(ShapedDistinctOreRecipe recipe) {
		return true;
	}

}
