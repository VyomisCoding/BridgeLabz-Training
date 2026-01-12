class EmailAlertService implements AlertService{
    @Override
    public void sendLowStockAlert(Product product){
        System.out.println(" ALERT: Low stock for product -> " + product.getName() + " | Quantity: " + product.getQuantity());
    }
}
