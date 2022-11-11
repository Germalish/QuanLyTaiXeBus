package contract;

public enum DriverLevel {
    LOAI_A ("Loại A"),
    LOAI_B ("Loại B"),
    LOAI_C ("Loại C"),
    LOAI_D ("Loại D"),
    LOAI_E ("Loại E"),
    LOAI_F ("Loại F");
    public String value;

    DriverLevel(String value) {
        this.value = value;
    }
}
