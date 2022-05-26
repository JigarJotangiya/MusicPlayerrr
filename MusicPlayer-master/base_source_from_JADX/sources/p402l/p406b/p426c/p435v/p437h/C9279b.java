package p402l.p406b.p426c.p435v.p437h;

import java.util.EnumSet;
import java.util.HashMap;

/* renamed from: l.b.c.v.h.b */
/* compiled from: Mp4FieldType */
public enum C9279b {
    IMPLICIT(0),
    TEXT(1),
    TEXT_UTF16BE(2),
    TEXT_JAPANESE(3),
    HTML(6),
    XML(7),
    GUID(8),
    ISRC(9),
    MI3P(10),
    COVERART_GIF(12),
    COVERART_JPEG(13),
    COVERART_PNG(14),
    URL(15),
    DURATION(16),
    DATETIME(17),
    GENRES(18),
    INTEGER(21),
    RIAAPA(24),
    UPC(25),
    COVERART_BMP(27);
    

    /* renamed from: g */
    private static final HashMap<Integer, C9279b> f35980g = null;

    /* renamed from: h */
    private static EnumSet<C9279b> f35981h;
    private int fileClassId;

    static {
        f35980g = new HashMap<>(values().length);
        for (C9279b bVar : values()) {
            f35980g.put(Integer.valueOf(bVar.fileClassId), bVar);
        }
        f35981h = EnumSet.of(COVERART_GIF, COVERART_JPEG, COVERART_PNG, COVERART_BMP);
    }

    private C9279b(int i) {
        this.fileClassId = i;
    }

    public static C9279b getFieldType(int i) {
        return f35980g.get(Integer.valueOf(i));
    }

    public static boolean isCoverArtType(C9279b bVar) {
        return f35981h.contains(bVar);
    }

    public int getFileClassId() {
        return this.fileClassId;
    }
}
