package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public enum bq3 {
    DOUBLE(cq3.DOUBLE, 1),
    FLOAT(cq3.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(cq3.BOOLEAN, 0),
    STRING(cq3.STRING, 2),
    GROUP(r13, 3),
    MESSAGE(r13, 2),
    BYTES(cq3.BYTE_STRING, 2),
    UINT32(r11, 0),
    ENUM(cq3.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    
    private final cq3 zzt;

    private bq3(cq3 cq3, int i) {
        this.zzt = cq3;
    }

    public final cq3 zza() {
        return this.zzt;
    }
}
