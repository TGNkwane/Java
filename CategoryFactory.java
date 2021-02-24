public class CategoryFactory {

    public Catalogue GetCatalogue(String type){
        Catalogue catalogue = null;
        
        switch (type.toLowerCase()) {
            case "shirt":
                catalogue = new Shirt();
                break;

            case "trouser":
                catalogue = new Trouser();
                break;
        
            default:
                System.out.printf("%s does not exist", type);
                break;
        }

        return catalogue;
    }
}
