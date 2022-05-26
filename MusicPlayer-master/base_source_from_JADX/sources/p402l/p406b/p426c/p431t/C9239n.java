package p402l.p406b.p426c.p431t;

import java.util.logging.Logger;
import p402l.p406b.p426c.C9134n;

/* renamed from: l.b.c.t.n */
/* compiled from: ID3TextEncodingConversion */
public class C9239n {

    /* renamed from: a */
    public static Logger f35930a = Logger.getLogger("org.jaudiotagger.tag.id3");

    /* renamed from: a */
    private static byte m49077a(byte b) {
        if (b == 2) {
            return 1;
        }
        if (b == 3) {
            return 0;
        }
        return b;
    }

    /* renamed from: b */
    public static byte m49078b(C9188f fVar, byte b) {
        if (fVar == null) {
            f35930a.warning("Header has not yet been set for this framebody");
            if (C9134n.m48562h().mo31726A()) {
                return C9134n.m48562h().mo31736e();
            }
            return m49077a(b);
        } else if (fVar instanceof C9185e0) {
            return C9134n.m48562h().mo31726A() ? C9134n.m48562h().mo31737f() : b;
        } else {
            if (C9134n.m48562h().mo31726A()) {
                return C9134n.m48562h().mo31736e();
            }
            return m49077a(b);
        }
    }

    /* renamed from: c */
    public static byte m49079c(C9188f fVar) {
        if (fVar == null) {
            f35930a.warning("Header has not yet been set for this framebody");
            return 1;
        } else if (fVar instanceof C9185e0) {
            return C9134n.m48562h().mo31738g();
        } else {
            return 1;
        }
    }
}
