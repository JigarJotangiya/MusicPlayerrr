package p082e.p126k.p129c.p131j;

import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: e.k.c.j.w1 */
/* compiled from: WireFormat */
public final class C4042w1 {

    /* renamed from: a */
    static final int f12221a = m17904c(1, 3);

    /* renamed from: b */
    static final int f12222b = m17904c(1, 4);

    /* renamed from: c */
    static final int f12223c = m17904c(2, 0);

    /* renamed from: d */
    static final int f12224d = m17904c(3, 2);

    /* renamed from: e.k.c.j.w1$b */
    /* compiled from: WireFormat */
    public enum C4044b {
        DOUBLE(C4049c.DOUBLE, 1),
        FLOAT(C4049c.FLOAT, 5),
        INT64(r5, 0),
        UINT64(r5, 0),
        INT32(r11, 0),
        FIXED64(r5, 1),
        FIXED32(r11, 5),
        BOOL(C4049c.BOOLEAN, 0),
        STRING(C4049c.STRING, 2) {
            public boolean isPackable() {
                return false;
            }
        },
        GROUP(r13, 3) {
            public boolean isPackable() {
                return false;
            }
        },
        MESSAGE(r13, 2) {
            public boolean isPackable() {
                return false;
            }
        },
        BYTES(C4049c.BYTE_STRING, 2) {
            public boolean isPackable() {
                return false;
            }
        },
        UINT32(r11, 0),
        ENUM(C4049c.ENUM, 0),
        SFIXED32(r11, 5),
        SFIXED64(r5, 1),
        SINT32(r11, 0),
        SINT64(r5, 0);
        
        private final C4049c javaType;
        private final int wireType;

        public C4049c getJavaType() {
            return this.javaType;
        }

        public int getWireType() {
            return this.wireType;
        }

        public boolean isPackable() {
            return true;
        }

        private C4044b(C4049c cVar, int i) {
            this.javaType = cVar;
            this.wireType = i;
        }
    }

    /* renamed from: e.k.c.j.w1$c */
    /* compiled from: WireFormat */
    public enum C4049c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(BuildConfig.FLAVOR),
        BYTE_STRING(C3934i.EMPTY),
        ENUM((String) null),
        MESSAGE((String) null);
        
        private final Object defaultDefault;

        private C4049c(Object obj) {
            this.defaultDefault = obj;
        }

        /* access modifiers changed from: package-private */
        public Object getDefaultDefault() {
            return this.defaultDefault;
        }
    }

    /* renamed from: a */
    public static int m17902a(int i) {
        return i >>> 3;
    }

    /* renamed from: b */
    public static int m17903b(int i) {
        return i & 7;
    }

    /* renamed from: c */
    static int m17904c(int i, int i2) {
        return (i << 3) | i2;
    }
}
