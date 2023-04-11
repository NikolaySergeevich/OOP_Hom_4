public interface Security {
    /**
     * прочность
     * @return
     */
    int strength();

    /**
     * этото метод определяет вероятность персонаж использовать щит в зависимости от его веса
     * @return
     */
    int getProbabilityUsdShield();
}
