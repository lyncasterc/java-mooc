package Part10;

public enum DaysOfWeek {
    MONDAY("MON"),
    TUESDAY("TUE"),
    WEDNESDAY("WED"),
    THURSDAY("THUR"),
    FRIDAY("FRI"),
    SATURDAY("SAT"),
    SUNDAY("SUN");

    private String abbr;

    private DaysOfWeek(String abbr) {
        this.abbr = abbr;
    }

    public String getAbbr() {
        return abbr;
    }
}
