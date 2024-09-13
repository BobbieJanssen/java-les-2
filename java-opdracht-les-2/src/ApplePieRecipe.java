import org.w3c.dom.ls.LSOutput;

public class ApplePieRecipe {
    //    The ingredients
    Ingredient butter = new Ingredient("ongezouten roomboter", 200, "gram");

    Ingredient sugarWhite = new Ingredient("witte bastard suiker", 200, "gram");

    Ingredient flour = new Ingredient("zelfrijzend bakmeel", 400, "gram");

    Ingredient egg = new Ingredient("ei", 1, "stuk(s)");

    Ingredient vanillaSugar = new Ingredient("vanillesuiker", 8, "gram");

    Ingredient salt = new Ingredient("zout", 1, "snuf");

    Ingredient apples = new Ingredient("zoetzure appels", 1.5, "kilo");

    Ingredient sugarCrystal = new Ingredient("kristal suiker", 75, "gram");

    Ingredient cinnamon = new Ingredient("kaneel", 3, "theelepels");

    Ingredient breadcrumbs = new Ingredient("paneermeel", 15, "gram");

    // The Steps
    public void heatUp() {
        System.out.println("Step one: Heat up the oven");
    }

    public void whiskEgg() {
        System.out.println("Step two: ");
    }

    public void mixIngredients() {
        System.out.println("Step three:");
    }

    public void prepareApples() {
        System.out.println("Step four: ");
    }

    public void prepareCakeTin() {
        System.out.println("Step five: ");
    }

    public void placeDough() {
        System.out.println("Step six:");
    }

    public void mixApples() {
        System.out.println("Step seven: ");
    }

    public void cutDoughTopLayer() {
        System.out.println("Step eight: ");
    }

    public void decorateDough() {
        System.out.println("Step nine: ");
    }

    public void bake() {
        System.out.println("And last but not least");
    }
}