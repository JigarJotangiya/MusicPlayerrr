package p402l.p406b.p426c.p429r;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.logging.Logger;
import p402l.p406b.p426c.C9124d;
import p402l.p406b.p426c.p429r.C9160o;
import p402l.p406b.p426c.p429r.C9162p;
import p402l.p406b.p426c.p431t.C9190g;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: l.b.c.r.a */
/* compiled from: AbstractDataType */
public abstract class C9146a {

    /* renamed from: e */
    public static Logger f35770e = Logger.getLogger("org.jaudiotagger.tag.datatype");

    /* renamed from: a */
    protected Object f35771a = null;

    /* renamed from: b */
    protected String f35772b = BuildConfig.FLAVOR;

    /* renamed from: c */
    protected C9190g f35773c = null;

    /* renamed from: d */
    protected int f35774d;

    protected C9146a(String str, C9190g gVar) {
        this.f35772b = str;
        this.f35773c = gVar;
    }

    /* renamed from: a */
    public C9190g mo31774a() {
        return this.f35773c;
    }

    /* renamed from: b */
    public String mo31775b() {
        return this.f35772b;
    }

    /* renamed from: c */
    public abstract int mo31776c();

    /* renamed from: d */
    public Object mo31777d() {
        return this.f35771a;
    }

    /* renamed from: e */
    public abstract void mo31778e(byte[] bArr, int i) throws C9124d;

    public boolean equals(Object obj) {
        Object obj2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9146a)) {
            return false;
        }
        C9146a aVar = (C9146a) obj;
        if (!this.f35772b.equals(aVar.f35772b)) {
            return false;
        }
        Object obj3 = this.f35771a;
        if (obj3 == null && aVar.f35771a == null) {
            return true;
        }
        if (obj3 == null || (obj2 = aVar.f35771a) == null) {
            return false;
        }
        if (!(obj3 instanceof boolean[]) || !(obj2 instanceof boolean[])) {
            if (!(obj3 instanceof byte[]) || !(obj2 instanceof byte[])) {
                if (!(obj3 instanceof char[]) || !(obj2 instanceof char[])) {
                    if (!(obj3 instanceof double[]) || !(obj2 instanceof double[])) {
                        if (!(obj3 instanceof float[]) || !(obj2 instanceof float[])) {
                            if (!(obj3 instanceof int[]) || !(obj2 instanceof int[])) {
                                if (!(obj3 instanceof long[]) || !(obj2 instanceof long[])) {
                                    if (!(obj3 instanceof Object[]) || !(obj2 instanceof Object[])) {
                                        if (!(obj3 instanceof short[]) || !(obj2 instanceof short[])) {
                                            if (!obj3.equals(obj2)) {
                                                return false;
                                            }
                                        } else if (!Arrays.equals((short[]) obj3, (short[]) obj2)) {
                                            return false;
                                        }
                                    } else if (!Arrays.equals((Object[]) obj3, (Object[]) obj2)) {
                                        return false;
                                    }
                                } else if (!Arrays.equals((long[]) obj3, (long[]) obj2)) {
                                    return false;
                                }
                            } else if (!Arrays.equals((int[]) obj3, (int[]) obj2)) {
                                return false;
                            }
                        } else if (!Arrays.equals((float[]) obj3, (float[]) obj2)) {
                            return false;
                        }
                    } else if (!Arrays.equals((double[]) obj3, (double[]) obj2)) {
                        return false;
                    }
                } else if (!Arrays.equals((char[]) obj3, (char[]) obj2)) {
                    return false;
                }
            } else if (!Arrays.equals((byte[]) obj3, (byte[]) obj2)) {
                return false;
            }
        } else if (!Arrays.equals((boolean[]) obj3, (boolean[]) obj2)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public void mo31780f(C9190g gVar) {
        this.f35773c = gVar;
    }

    /* renamed from: g */
    public void mo31781g(Object obj) {
        this.f35771a = obj;
    }

    /* renamed from: h */
    public abstract byte[] mo31782h();

    protected C9146a(String str, C9190g gVar, Object obj) {
        this.f35772b = str;
        this.f35773c = gVar;
        mo31781g(obj);
    }

    public C9146a(C9146a aVar) {
        this.f35772b = aVar.f35772b;
        Object obj = aVar.f35771a;
        if (obj == null) {
            this.f35771a = null;
        } else if (obj instanceof String) {
            this.f35771a = obj;
        } else if (obj instanceof Boolean) {
            this.f35771a = obj;
        } else if (obj instanceof Byte) {
            this.f35771a = obj;
        } else if (obj instanceof Character) {
            this.f35771a = obj;
        } else if (obj instanceof Double) {
            this.f35771a = obj;
        } else if (obj instanceof Float) {
            this.f35771a = obj;
        } else if (obj instanceof Integer) {
            this.f35771a = obj;
        } else if (obj instanceof Long) {
            this.f35771a = obj;
        } else if (obj instanceof Short) {
            this.f35771a = obj;
        } else if (obj instanceof C9160o.C9161a) {
            this.f35771a = obj;
        } else if (obj instanceof C9162p.C9163a) {
            this.f35771a = obj;
        } else if (obj instanceof boolean[]) {
            this.f35771a = ((boolean[]) obj).clone();
        } else if (obj instanceof byte[]) {
            this.f35771a = ((byte[]) obj).clone();
        } else if (obj instanceof char[]) {
            this.f35771a = ((char[]) obj).clone();
        } else if (obj instanceof double[]) {
            this.f35771a = ((double[]) obj).clone();
        } else if (obj instanceof float[]) {
            this.f35771a = ((float[]) obj).clone();
        } else if (obj instanceof int[]) {
            this.f35771a = ((int[]) obj).clone();
        } else if (obj instanceof long[]) {
            this.f35771a = ((long[]) obj).clone();
        } else if (obj instanceof short[]) {
            this.f35771a = ((short[]) obj).clone();
        } else if (obj instanceof Object[]) {
            this.f35771a = ((Object[]) obj).clone();
        } else if (obj instanceof ArrayList) {
            this.f35771a = ((ArrayList) obj).clone();
        } else if (obj instanceof LinkedList) {
            this.f35771a = ((LinkedList) obj).clone();
        } else {
            throw new UnsupportedOperationException("Unable to create copy of class " + aVar.getClass());
        }
    }
}
