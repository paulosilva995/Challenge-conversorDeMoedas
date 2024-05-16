public record ConvertedCoin(String base_code, String target_code, double conversion_rate) {
    @Override
    public String toString() {
        return "%s".formatted(conversion_rate);
    }
}