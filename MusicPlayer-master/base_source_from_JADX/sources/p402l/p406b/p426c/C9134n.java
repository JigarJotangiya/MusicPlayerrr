package p402l.p406b.p426c;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import p402l.p406b.p426c.p431t.p432k0.C9203c;
import p402l.p406b.p426c.p431t.p432k0.C9205d;
import p402l.p406b.p426c.p431t.p432k0.C9206d0;
import p402l.p406b.p426c.p431t.p432k0.C9218p;
import p402l.p406b.p426c.p434u.C9268m;
import p402l.p406b.p426c.p438w.C9289a;
import p402l.p406b.p426c.p439x.C9290a;
import p402l.p406b.p426c.p439x.C9291b;

/* renamed from: l.b.c.n */
/* compiled from: TagOptionSingleton */
public class C9134n {

    /* renamed from: C */
    private static HashMap<String, C9134n> f35728C = new HashMap<>();

    /* renamed from: D */
    private static String f35729D = "default";

    /* renamed from: E */
    private static String f35730E = "default";

    /* renamed from: A */
    private boolean f35731A = false;

    /* renamed from: B */
    private C9291b f35732B = C9291b.ID3_V23;

    /* renamed from: a */
    private HashMap<Class<? extends C9206d0>, LinkedList<String>> f35733a = new HashMap<>();

    /* renamed from: b */
    private HashMap<String, Boolean> f35734b = new HashMap<>();

    /* renamed from: c */
    private HashMap<String, String> f35735c = new HashMap<>();

    /* renamed from: d */
    private HashMap<String, String> f35736d = new HashMap<>();

    /* renamed from: e */
    private boolean f35737e = true;

    /* renamed from: f */
    private boolean f35738f = true;

    /* renamed from: g */
    private boolean f35739g = true;

    /* renamed from: h */
    private boolean f35740h = true;

    /* renamed from: i */
    private boolean f35741i = true;

    /* renamed from: j */
    private boolean f35742j = true;

    /* renamed from: k */
    private boolean f35743k = true;

    /* renamed from: l */
    private boolean f35744l = true;

    /* renamed from: m */
    private boolean f35745m = true;

    /* renamed from: n */
    private boolean f35746n = false;

    /* renamed from: o */
    private boolean f35747o = false;

    /* renamed from: p */
    private boolean f35748p = true;

    /* renamed from: q */
    private byte f35749q = 0;

    /* renamed from: r */
    private byte f35750r = 0;

    /* renamed from: s */
    private byte f35751s = 1;

    /* renamed from: t */
    private boolean f35752t = false;

    /* renamed from: u */
    private boolean f35753u = false;

    /* renamed from: v */
    private boolean f35754v = false;

    /* renamed from: w */
    private C9289a f35755w = C9289a.PAD_ONE_ZERO;

    /* renamed from: x */
    private boolean f35756x = true;

    /* renamed from: y */
    private long f35757y = 5000000;

    /* renamed from: z */
    private boolean f35758z = false;

    private C9134n() {
        mo31731F();
    }

    /* renamed from: h */
    public static C9134n m48562h() {
        return m48563i(f35730E);
    }

    /* renamed from: i */
    public static C9134n m48563i(String str) {
        C9134n nVar = f35728C.get(str);
        if (nVar != null) {
            return nVar;
        }
        C9134n nVar2 = new C9134n();
        f35728C.put(str, nVar2);
        return nVar2;
    }

    /* renamed from: A */
    public boolean mo31726A() {
        return this.f35752t;
    }

    /* renamed from: B */
    public boolean mo31727B() {
        return this.f35753u;
    }

    /* renamed from: C */
    public boolean mo31728C() {
        return this.f35747o;
    }

    /* renamed from: D */
    public boolean mo31729D() {
        return this.f35731A;
    }

    /* renamed from: E */
    public boolean mo31730E() {
        return this.f35758z;
    }

    /* renamed from: F */
    public void mo31731F() {
        Class<C9218p> cls = C9218p.class;
        Class<C9205d> cls2 = C9205d.class;
        this.f35733a = new HashMap<>();
        this.f35737e = true;
        this.f35738f = true;
        this.f35739g = true;
        this.f35740h = true;
        this.f35741i = true;
        this.f35742j = true;
        this.f35743k = true;
        this.f35744l = true;
        this.f35745m = true;
        this.f35746n = false;
        this.f35734b = new HashMap<>();
        this.f35735c = new HashMap<>();
        this.f35736d = new HashMap<>();
        this.f35747o = false;
        this.f35748p = true;
        this.f35749q = 0;
        this.f35750r = 0;
        this.f35751s = 1;
        this.f35752t = false;
        this.f35753u = false;
        this.f35754v = false;
        this.f35756x = true;
        this.f35757y = 5000000;
        this.f35758z = false;
        this.f35755w = C9289a.PAD_ONE_ZERO;
        this.f35732B = C9291b.ID3_V23;
        for (String put : C9268m.m49219e().mo31790a().keySet()) {
            this.f35734b.put(put, Boolean.TRUE);
        }
        try {
            mo31732a(cls2, "ultimix");
            mo31732a(cls2, "dance");
            mo31732a(cls2, "mix");
            mo31732a(cls2, "remix");
            mo31732a(cls2, "rmx");
            mo31732a(cls2, "live");
            mo31732a(cls2, "cover");
            mo31732a(cls2, "soundtrack");
            mo31732a(cls2, "version");
            mo31732a(cls2, "acoustic");
            mo31732a(cls2, "original");
            mo31732a(cls2, "cd");
            mo31732a(cls2, "extended");
            mo31732a(cls2, "vocal");
            mo31732a(cls2, "unplugged");
            mo31732a(cls2, "acapella");
            mo31732a(cls2, "edit");
            mo31732a(cls2, "radio");
            mo31732a(cls2, "original");
            mo31732a(cls2, "album");
            mo31732a(cls2, "studio");
            mo31732a(cls2, "instrumental");
            mo31732a(cls2, "unedited");
            mo31732a(cls2, "karoke");
            mo31732a(cls2, "quality");
            mo31732a(cls2, "uncensored");
            mo31732a(cls2, "clean");
            mo31732a(cls2, "dirty");
            mo31732a(cls, "f.");
            mo31732a(cls, "feat");
            mo31732a(cls, "feat.");
            mo31732a(cls, "featuring");
            mo31732a(cls, "ftng");
            mo31732a(cls, "ftng.");
            mo31732a(cls, "ft.");
            mo31732a(cls, "ft");
            for (String a : C9290a.m49277h().mo31792c().keySet()) {
                mo31732a(cls2, a);
            }
            mo31734c("v.", "vs.");
            mo31734c("vs.", "vs.");
            mo31734c("versus", "vs.");
            mo31734c("f.", "feat.");
            mo31734c("feat", "feat.");
            mo31734c("featuring", "feat.");
            mo31734c("ftng.", "feat.");
            mo31734c("ftng", "feat.");
            mo31734c("ft.", "feat.");
            mo31734c("ft", "feat.");
            mo31739j(cls);
            mo31733b("(", ")");
            mo31733b("[", "]");
            mo31733b("{", "}");
            mo31733b("<", ">");
        } catch (C9131k e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public void mo31732a(Class<? extends C9206d0> cls, String str) throws C9131k {
        LinkedList linkedList;
        if (!C9203c.class.isAssignableFrom(cls)) {
            throw new C9131k("Invalid class type. Must be AbstractId3v2FrameBody " + cls);
        } else if (str != null && str.length() > 0) {
            if (!this.f35733a.containsKey(cls)) {
                linkedList = new LinkedList();
                this.f35733a.put(cls, linkedList);
            } else {
                linkedList = this.f35733a.get(cls);
            }
            linkedList.add(str);
        }
    }

    /* renamed from: b */
    public void mo31733b(String str, String str2) {
        this.f35735c.put(str, str2);
    }

    /* renamed from: c */
    public void mo31734c(String str, String str2) {
        this.f35736d.put(str, str2);
    }

    /* renamed from: d */
    public C9291b mo31735d() {
        return this.f35732B;
    }

    /* renamed from: e */
    public byte mo31736e() {
        return this.f35749q;
    }

    /* renamed from: f */
    public byte mo31737f() {
        return this.f35750r;
    }

    /* renamed from: g */
    public byte mo31738g() {
        return this.f35751s;
    }

    /* renamed from: j */
    public Iterator<String> mo31739j(Class<? extends C9206d0> cls) {
        return this.f35733a.get(cls).iterator();
    }

    /* renamed from: k */
    public boolean mo31740k(String str) {
        return this.f35734b.get(str).booleanValue();
    }

    /* renamed from: l */
    public C9289a mo31741l() {
        return this.f35755w;
    }

    /* renamed from: m */
    public long mo31742m() {
        return this.f35757y;
    }

    /* renamed from: n */
    public boolean mo31743n() {
        return this.f35756x;
    }

    /* renamed from: o */
    public boolean mo31744o() {
        return this.f35737e;
    }

    /* renamed from: p */
    public boolean mo31745p() {
        return this.f35738f;
    }

    /* renamed from: q */
    public boolean mo31746q() {
        return this.f35739g;
    }

    /* renamed from: r */
    public boolean mo31747r() {
        return this.f35740h;
    }

    /* renamed from: s */
    public boolean mo31748s() {
        return this.f35741i;
    }

    /* renamed from: t */
    public boolean mo31749t() {
        return this.f35742j;
    }

    /* renamed from: u */
    public boolean mo31750u() {
        return this.f35743k;
    }

    /* renamed from: v */
    public boolean mo31751v() {
        return this.f35744l;
    }

    /* renamed from: w */
    public boolean mo31752w() {
        return this.f35745m;
    }

    /* renamed from: x */
    public boolean mo31753x() {
        return this.f35746n;
    }

    /* renamed from: y */
    public boolean mo31754y() {
        return this.f35754v;
    }

    /* renamed from: z */
    public boolean mo31755z() {
        return this.f35748p;
    }
}
