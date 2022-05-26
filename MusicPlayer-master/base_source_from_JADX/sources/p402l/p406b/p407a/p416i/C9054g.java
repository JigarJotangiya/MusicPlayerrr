package p402l.p406b.p407a.p416i;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import p402l.p406b.p425b.C9118b;
import p402l.p406b.p426c.C9122b;
import p402l.p406b.p426c.C9123c;
import p402l.p406b.p426c.C9128h;
import p402l.p406b.p426c.C9132l;
import p402l.p406b.p426c.C9135o;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: l.b.a.i.g */
/* compiled from: GenericTag */
public abstract class C9054g extends C9047a {

    /* renamed from: i */
    private static EnumSet<C9123c> f35533i = EnumSet.of(C9123c.ALBUM, new C9123c[]{C9123c.ARTIST, C9123c.TITLE, C9123c.TRACK, C9123c.GENRE, C9123c.COMMENT, C9123c.YEAR});

    /* renamed from: l.b.a.i.g$a */
    /* compiled from: GenericTag */
    private class C9055a implements C9135o {

        /* renamed from: g */
        private String f35534g;

        /* renamed from: h */
        private final String f35535h;

        public C9055a(C9054g gVar, String str, String str2) {
            this.f35535h = str;
            this.f35534g = str2;
        }

        /* renamed from: D */
        public String mo31497D() {
            return this.f35535h;
        }

        /* renamed from: a */
        public String mo31560a() {
            return "ISO-8859-1";
        }

        /* renamed from: c */
        public byte[] mo31499c() {
            String str = this.f35534g;
            return str == null ? new byte[0] : C9057i.m48300c(str, mo31560a());
        }

        /* renamed from: f */
        public boolean mo31500f() {
            return true;
        }

        public String getContent() {
            return this.f35534g;
        }

        public boolean isEmpty() {
            return this.f35534g.equals(BuildConfig.FLAVOR);
        }

        public String toString() {
            return getContent();
        }
    }

    /* renamed from: a */
    public List<C9132l> mo31559a(C9123c cVar) throws C9128h {
        List<C9132l> list = this.f35526h.get(cVar.name());
        return list == null ? new ArrayList() : list;
    }

    /* renamed from: g */
    public C9132l mo31523g(C9123c cVar, String str) throws C9128h, C9122b {
        if (f35533i.contains(cVar)) {
            return new C9055a(this, cVar.name(), str);
        }
        throw new UnsupportedOperationException(C9118b.GENERIC_NOT_SUPPORTED.getMsg());
    }
}
