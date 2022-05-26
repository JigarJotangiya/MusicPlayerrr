package p402l.p406b.p426c.p431t;

import java.nio.ByteBuffer;
import java.util.logging.Logger;
import p402l.p406b.p426c.C9131k;

/* renamed from: l.b.c.t.h */
/* compiled from: AbstractTagItem */
public abstract class C9192h {

    /* renamed from: g */
    public static Logger f35863g = Logger.getLogger("org.jaudiotagger.tag.id3");

    public C9192h() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj instanceof C9192h;
    }

    /* renamed from: g */
    public abstract String mo31857g();

    /* renamed from: h */
    public abstract int mo31919h();

    /* renamed from: i */
    public abstract void mo31887i(ByteBuffer byteBuffer) throws C9131k;

    public C9192h(C9192h hVar) {
    }
}
