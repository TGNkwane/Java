public class Client{
    public static void main(String[] args) {
        CategoryFactory categoryFactory =  new CategoryFactory();
        Catalogue catalogueShirt = categoryFactory.GetCatalogue("Shirt");
        Catalogue catalogueTrouser = categoryFactory.GetCatalogue("TrouSer");
        catalogueShirt.Display();
        catalogueTrouser.Display();
    }
}