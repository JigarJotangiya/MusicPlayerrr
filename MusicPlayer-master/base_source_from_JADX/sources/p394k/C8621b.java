package p394k;

import p369i.p376f0.C8422d;
import p369i.p387z.p389d.C8594l;

/* renamed from: k.b */
/* compiled from: -Platform.kt */
public final class C8621b {
    /* renamed from: a */
    public static final byte[] m46811a(String str) {
        C8594l.m46771e(str, "$this$asUtf8ToByteArray");
        byte[] bytes = str.getBytes(C8422d.f34888a);
        C8594l.m46770d(bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    /* renamed from: b */
    public static final String m46812b(byte[] bArr) {
        C8594l.m46771e(bArr, "$this$toUtf8String");
        return new String(bArr, C8422d.f34888a);
    }
}
