

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

    // print the ingredients
    public void printIngredients() {
        System.out.println("Dit zijn de ingrediënten:");
        System.out.println("• " + butter.getAmount() + " " + butter.getUnit() + " " + butter.getName());
        System.out.println("• " + sugarWhite.getAmount() + " " + sugarWhite.getUnit() + " " + sugarWhite.getName());
        System.out.println("• " + flour.getAmount() + " " + flour.getUnit() + " " + flour.getName());
        System.out.println("• " + egg.getAmount() + " " + egg.getUnit() + " " + egg.getName());
        System.out.println("• " + vanillaSugar.getAmount() + " " + vanillaSugar.getUnit() + " " + vanillaSugar.getName());
        System.out.println("• " + salt.getAmount() + " " + salt.getUnit() + " " + salt.getName());
        System.out.println("• " + apples.getAmount() + " " + apples.getUnit() + " " + apples.getName());
        System.out.println("• " + sugarCrystal.getAmount() + " " + sugarCrystal.getUnit() + " " + sugarCrystal.getName());
        System.out.println("• " + cinnamon.getAmount() + " " + cinnamon.getUnit() + " " + cinnamon.getName());
        System.out.println("• " + breadcrumbs.getAmount() + " " + breadcrumbs.getUnit() + " " + breadcrumbs.getName());
        System.out.println(" ");
    }

    // The Steps
    public void heatUp() {
        System.out.println("1. Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte).\n");
    }

    public void whiskEgg() {
        System.out.println("2. Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel\n" +
                "is voor het bestrijken van de appeltaart. \n");
    }

    public void mixIngredients() {
        System.out.println("3. Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een\n" +
                "snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.\n");
    }

    public void prepareApples() {
        System.out.println("4. Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.\n");
    }

    public void prepareCakeTin() {
        System.out.println("5. Vet de springvorm in en bestrooi deze met bloem\n");
    }

    public void placeDough() {
        System.out.println("6. Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg\n" +
                "om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel\n " +
                "neemt het vocht van de appels op.\n");
    }

    public void mixApples() {
        System.out.println("7. Doe de heft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen.\n" +
                "Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.\n");
    }

    public void cutDoughTopLayer() {
        System.out.println("8. Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.\n");
    }

    public void decorateDough() {
        System.out.println("9. Leg de stroken kuislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af.\n" +
                "Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken.\n");
    }

    public void bake() {
        System.out.println("10. Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius\n" +
                "(boven en onderwarmte) gaar en goudbruin.\n");
    }

    public void printRecipe() {
        printIngredients();
        System.out.println("Bereiding:");
        heatUp();
        whiskEgg();
        mixIngredients();
        prepareApples();
        prepareCakeTin();
        placeDough();
        mixApples();
        cutDoughTopLayer();
        decorateDough();
        bake();
        System.out.println("Lekker smullen!");
    }
}

