package p402l.p406b.p426c.p431t;

import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import p402l.p406b.p426c.C9124d;
import p402l.p406b.p426c.C9125e;
import p402l.p406b.p426c.C9127g;
import p402l.p406b.p426c.C9129i;
import p402l.p406b.p426c.C9134n;
import p402l.p406b.p426c.C9135o;
import p402l.p406b.p426c.p431t.p432k0.C9203c;
import p402l.p406b.p426c.p431t.p432k0.C9208f;
import p402l.p406b.p426c.p431t.p432k0.C9228z;
import p402l.p406b.p441d.C9300a;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: l.b.c.t.c */
/* compiled from: AbstractID3v2Frame */
public abstract class C9176c extends C9188f implements C9135o {

    /* renamed from: i */
    protected String f35818i = BuildConfig.FLAVOR;

    /* renamed from: j */
    protected int f35819j;

    /* renamed from: k */
    private String f35820k = BuildConfig.FLAVOR;

    /* renamed from: l */
    C9178b f35821l = null;

    /* renamed from: m */
    C9177a f35822m = null;

    /* renamed from: l.b.c.t.c$b */
    /* compiled from: AbstractID3v2Frame */
    public class C9178b {

        /* renamed from: a */
        protected byte f35824a;

        /* renamed from: b */
        protected byte f35825b;

        protected C9178b(C9176c cVar) {
        }

        /* renamed from: a */
        public byte mo31874a() {
            return this.f35824a;
        }

        /* renamed from: b */
        public byte mo31875b() {
            return this.f35825b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9178b)) {
                return false;
            }
            C9178b bVar = (C9178b) obj;
            if (!C9300a.m49298a((long) mo31874a(), (long) bVar.mo31874a()) || !C9300a.m49298a((long) mo31875b(), (long) bVar.mo31875b())) {
                return false;
            }
            return true;
        }
    }

    protected C9176c() {
    }

    /* renamed from: D */
    public String mo31497D() {
        return mo31857g();
    }

    /* renamed from: c */
    public byte[] mo31499c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        mo31869w(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9176c)) {
            return false;
        }
        return super.equals((C9176c) obj);
    }

    /* renamed from: g */
    public String mo31857g() {
        return this.f35818i;
    }

    public String getContent() {
        return mo31934j().mo31943o();
    }

    public boolean isEmpty() {
        return mo31934j() == null;
    }

    /* renamed from: l */
    public C9177a mo31858l() {
        return this.f35822m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract int mo31859m();

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract int mo31860n();

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public String mo31861o() {
        return this.f35820k;
    }

    /* renamed from: p */
    public C9178b mo31862p() {
        return this.f35821l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public boolean mo31863q(byte[] bArr) {
        return bArr[0] == 0 && bArr[1] == 0 && bArr[2] == 0 && bArr[3] == 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public C9203c mo31864r(String str, ByteBuffer byteBuffer, int i) throws C9125e, C9124d {
        C9203c cVar;
        C9192h.f35863g.finest("Creating framebody:start");
        try {
            Class<?> cls = Class.forName("org.jaudiotagger.tag.id3.framebody.FrameBody" + str);
            Class[] clsArr = {Class.forName("java.nio.ByteBuffer"), Integer.TYPE};
            cVar = (C9203c) cls.getConstructor(clsArr).newInstance(new Object[]{byteBuffer, Integer.valueOf(i)});
        } catch (ClassNotFoundException unused) {
            Logger logger = C9192h.f35863g;
            logger.config(mo31861o() + ":" + "Identifier not recognised:" + str + " using FrameBodyUnsupported");
            try {
                cVar = new C9228z(byteBuffer, i);
            } catch (C9125e e) {
                throw e;
            } catch (C9127g e2) {
                throw new C9125e(e2.getMessage());
            }
        } catch (InvocationTargetException e3) {
            Logger logger2 = C9192h.f35863g;
            logger2.severe(mo31861o() + ":" + "An error occurred within abstractID3v2FrameBody for identifier:" + str + ":" + e3.getCause().getMessage());
            if (e3.getCause() instanceof Error) {
                throw ((Error) e3.getCause());
            } else if (e3.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e3.getCause());
            } else if (e3.getCause() instanceof C9125e) {
                throw ((C9125e) e3.getCause());
            } else if (e3.getCause() instanceof C9124d) {
                throw ((C9124d) e3.getCause());
            } else {
                throw new C9125e(e3.getCause().getMessage());
            }
        } catch (NoSuchMethodException e4) {
            Logger logger3 = C9192h.f35863g;
            Level level = Level.SEVERE;
            logger3.log(level, mo31861o() + ":" + "No such method:" + e4.getMessage(), e4);
            throw new RuntimeException(e4.getMessage());
        } catch (InstantiationException e5) {
            Logger logger4 = C9192h.f35863g;
            Level level2 = Level.SEVERE;
            logger4.log(level2, mo31861o() + ":" + "Instantiation exception:" + e5.getMessage(), e5);
            throw new RuntimeException(e5.getMessage());
        } catch (IllegalAccessException e6) {
            Logger logger5 = C9192h.f35863g;
            Level level3 = Level.SEVERE;
            logger5.log(level3, mo31861o() + ":" + "Illegal access exception :" + e6.getMessage(), e6);
            throw new RuntimeException(e6.getMessage());
        }
        Logger logger6 = C9192h.f35863g;
        logger6.finest(mo31861o() + ":" + "Created framebody:end" + cVar.mo31857g());
        cVar.mo31945q(this);
        return cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public C9203c mo31865s(String str, C9203c cVar) throws C9125e {
        try {
            Object[] objArr = {cVar};
            C9203c cVar2 = (C9203c) Class.forName("org.jaudiotagger.tag.id3.framebody.FrameBody" + str).getConstructor(new Class[]{cVar.getClass()}).newInstance(objArr);
            Logger logger = C9192h.f35863g;
            logger.finer("frame Body created" + cVar2.mo31857g());
            cVar2.mo31945q(this);
            return cVar2;
        } catch (ClassNotFoundException unused) {
            Logger logger2 = C9192h.f35863g;
            logger2.config("Identifier not recognised:" + str + " unable to create framebody");
            throw new C9125e("FrameBody" + str + " does not exist");
        } catch (NoSuchMethodException e) {
            Logger logger3 = C9192h.f35863g;
            Level level = Level.SEVERE;
            logger3.log(level, "No such method:" + e.getMessage(), e);
            throw new C9125e("FrameBody" + str + " does not have a constructor that takes:" + cVar.getClass().getName());
        } catch (InvocationTargetException e2) {
            C9192h.f35863g.severe("An error occurred within abstractID3v2FrameBody");
            Logger logger4 = C9192h.f35863g;
            Level level2 = Level.SEVERE;
            logger4.log(level2, "Invocation target exception:" + e2.getCause().getMessage(), e2.getCause());
            if (e2.getCause() instanceof Error) {
                throw ((Error) e2.getCause());
            } else if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            } else {
                throw new C9125e(e2.getCause().getMessage());
            }
        } catch (InstantiationException e3) {
            Logger logger5 = C9192h.f35863g;
            Level level3 = Level.SEVERE;
            logger5.log(level3, "Instantiation exception:" + e3.getMessage(), e3);
            throw new RuntimeException(e3.getMessage());
        } catch (IllegalAccessException e4) {
            Logger logger6 = C9192h.f35863g;
            Level level4 = Level.SEVERE;
            logger6.log(level4, "Illegal access exception :" + e4.getMessage(), e4);
            throw new RuntimeException(e4.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public C9203c mo31866t(String str, ByteBuffer byteBuffer, int i) throws C9125e, C9124d {
        try {
            C9208f fVar = new C9208f(str, byteBuffer, i);
            fVar.mo31945q(this);
            return fVar;
        } catch (C9127g e) {
            throw new C9124d((Throwable) e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public String mo31867u(ByteBuffer byteBuffer) throws C9129i, C9125e {
        byte[] bArr = new byte[mo31860n()];
        if (byteBuffer.position() + mo31859m() < byteBuffer.limit()) {
            byteBuffer.get(bArr, 0, mo31860n());
            if (!mo31863q(bArr)) {
                this.f35818i = new String(bArr);
                Logger logger = C9192h.f35863g;
                logger.fine(mo31861o() + ":" + "Identifier is" + this.f35818i);
                return this.f35818i;
            }
            throw new C9129i(mo31861o() + ":only padding found");
        }
        Logger logger2 = C9192h.f35863g;
        logger2.warning(mo31861o() + ":" + "No space to find another frame:");
        throw new C9125e(mo31861o() + ":" + "No space to find another frame");
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo31868v(String str) {
        this.f35820k = str;
    }

    /* renamed from: w */
    public abstract void mo31869w(ByteArrayOutputStream byteArrayOutputStream);

    /* renamed from: l.b.c.t.c$a */
    /* compiled from: AbstractID3v2Frame */
    class C9177a {

        /* renamed from: a */
        protected byte f35823a;

        protected C9177a(C9176c cVar) {
            mo31871b();
        }

        /* renamed from: a */
        public byte mo31870a() {
            return this.f35823a;
        }

        /* renamed from: b */
        public void mo31871b() {
            mo31872c((byte) 0);
        }

        /* renamed from: c */
        public void mo31872c(byte b) {
            this.f35823a = b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9177a)) {
                return false;
            }
            return C9300a.m49298a((long) mo31870a(), (long) ((C9177a) obj).mo31870a());
        }

        protected C9177a(C9176c cVar, byte b) {
            mo31872c(b);
        }
    }

    public C9176c(String str) {
        Logger logger = C9192h.f35863g;
        logger.config("Creating empty frame of type" + str);
        this.f35818i = str;
        try {
            this.f35855h = (C9190g) Class.forName("org.jaudiotagger.tag.id3.framebody.FrameBody" + str).newInstance();
        } catch (ClassNotFoundException e) {
            C9192h.f35863g.severe(e.getMessage());
            this.f35855h = new C9228z(str);
        } catch (InstantiationException e2) {
            Logger logger2 = C9192h.f35863g;
            Level level = Level.SEVERE;
            logger2.log(level, "InstantiationException:" + str, e2);
            throw new RuntimeException(e2);
        } catch (IllegalAccessException e3) {
            Logger logger3 = C9192h.f35863g;
            Level level2 = Level.SEVERE;
            logger3.log(level2, "IllegalAccessException:" + str, e3);
            throw new RuntimeException(e3);
        }
        this.f35855h.mo31945q(this);
        if (this instanceof C9185e0) {
            this.f35855h.mo31947s(C9134n.m48562h().mo31737f());
        } else if (this instanceof C9253z) {
            this.f35855h.mo31947s(C9134n.m48562h().mo31736e());
        }
        Logger logger4 = C9192h.f35863g;
        logger4.config("Created empty frame of type" + str);
    }
}
