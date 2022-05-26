package p159f.p237d.p238a;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import p159f.p237d.p238a.C4825c;
import p159f.p237d.p238a.p239g.C4843i;

/* renamed from: f.d.a.d */
/* compiled from: ReLinkerInstance */
public class C4830d {

    /* renamed from: a */
    protected final Set<String> f13637a;

    /* renamed from: b */
    protected final C4825c.C4827b f13638b;

    /* renamed from: c */
    protected final C4825c.C4826a f13639c;

    /* renamed from: d */
    protected boolean f13640d;

    /* renamed from: e */
    protected boolean f13641e;

    /* renamed from: f */
    protected C4825c.C4829d f13642f;

    /* renamed from: f.d.a.d$a */
    /* compiled from: ReLinkerInstance */
    class C4831a implements Runnable {

        /* renamed from: g */
        final /* synthetic */ Context f13643g;

        /* renamed from: h */
        final /* synthetic */ String f13644h;

        /* renamed from: i */
        final /* synthetic */ String f13645i;

        /* renamed from: j */
        final /* synthetic */ C4825c.C4828c f13646j;

        C4831a(Context context, String str, String str2, C4825c.C4828c cVar) {
            this.f13643g = context;
            this.f13644h = str;
            this.f13645i = str2;
            this.f13646j = cVar;
        }

        public void run() {
            try {
                C4830d.this.m20460g(this.f13643g, this.f13644h, this.f13645i);
                this.f13646j.mo15573a();
            } catch (UnsatisfiedLinkError e) {
                this.f13646j.mo15574b(e);
            } catch (C4824b e2) {
                this.f13646j.mo15574b(e2);
            }
        }
    }

    /* renamed from: f.d.a.d$b */
    /* compiled from: ReLinkerInstance */
    class C4832b implements FilenameFilter {

        /* renamed from: a */
        final /* synthetic */ String f13648a;

        C4832b(C4830d dVar, String str) {
            this.f13648a = str;
        }

        public boolean accept(File file, String str) {
            return str.startsWith(this.f13648a);
        }
    }

    protected C4830d() {
        this(new C4833e(), new C4822a());
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m20460g(Context context, String str, String str2) {
        C4843i iVar;
        C4843i iVar2;
        if (!this.f13637a.contains(str) || this.f13640d) {
            try {
                this.f13638b.mo15569b(str);
                this.f13637a.add(str);
                mo15582i("%s (%s) was loaded normally!", str, str2);
            } catch (UnsatisfiedLinkError e) {
                mo15582i("Loading the library normally failed: %s", Log.getStackTraceString(e));
                mo15582i("%s (%s) was not loaded normally, re-linking...", str, str2);
                File d = mo15578d(context, str, str2);
                if (!d.exists() || this.f13640d) {
                    if (this.f13640d) {
                        mo15582i("Forcing a re-link of %s (%s)...", str, str2);
                    }
                    mo15576b(context, str, str2);
                    this.f13639c.mo15567a(context, this.f13638b.mo15571d(), this.f13638b.mo15568a(str), d, this);
                }
                try {
                    if (this.f13641e) {
                        iVar = null;
                        iVar2 = new C4843i(d);
                        List<String> p = iVar2.mo15595p();
                        iVar2.close();
                        for (String c : p) {
                            mo15579e(context, this.f13638b.mo15570c(c));
                        }
                    }
                } catch (IOException unused) {
                }
                this.f13638b.mo15572e(d.getAbsolutePath());
                this.f13637a.add(str);
                mo15582i("%s (%s) was re-linked!", str, str2);
            } catch (Throwable th) {
                th = th;
                iVar = iVar2;
                iVar.close();
                throw th;
            }
        } else {
            mo15582i("%s already loaded previously!", str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo15576b(Context context, String str, String str2) {
        File c = mo15577c(context);
        File d = mo15578d(context, str, str2);
        File[] listFiles = c.listFiles(new C4832b(this, this.f13638b.mo15568a(str)));
        if (listFiles != null) {
            for (File file : listFiles) {
                if (this.f13640d || !file.getAbsolutePath().equals(d.getAbsolutePath())) {
                    file.delete();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public File mo15577c(Context context) {
        return context.getDir("lib", 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public File mo15578d(Context context, String str, String str2) {
        String a = this.f13638b.mo15568a(str);
        if (C4834f.m20473a(str2)) {
            return new File(mo15577c(context), a);
        }
        File c = mo15577c(context);
        return new File(c, a + "." + str2);
    }

    /* renamed from: e */
    public void mo15579e(Context context, String str) {
        mo15580f(context, str, (String) null, (C4825c.C4828c) null);
    }

    /* renamed from: f */
    public void mo15580f(Context context, String str, String str2, C4825c.C4828c cVar) {
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        } else if (!C4834f.m20473a(str)) {
            mo15582i("Beginning load of %s...", str);
            if (cVar == null) {
                m20460g(context, str, str2);
            } else {
                new Thread(new C4831a(context, str, str2, cVar)).start();
            }
        } else {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
    }

    /* renamed from: h */
    public void mo15581h(String str) {
        C4825c.C4829d dVar = this.f13642f;
        if (dVar != null) {
            dVar.log(str);
        }
    }

    /* renamed from: i */
    public void mo15582i(String str, Object... objArr) {
        mo15581h(String.format(Locale.US, str, objArr));
    }

    protected C4830d(C4825c.C4827b bVar, C4825c.C4826a aVar) {
        this.f13637a = new HashSet();
        if (bVar == null) {
            throw new IllegalArgumentException("Cannot pass null library loader");
        } else if (aVar != null) {
            this.f13638b = bVar;
            this.f13639c = aVar;
        } else {
            throw new IllegalArgumentException("Cannot pass null library installer");
        }
    }
}
