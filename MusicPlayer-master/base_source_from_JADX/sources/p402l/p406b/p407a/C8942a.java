package p402l.p406b.p407a;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.logging.Logger;
import p402l.p406b.p407a.p408e.C8950c;
import p402l.p406b.p407a.p413g.C9017c;
import p402l.p406b.p407a.p413g.C9022h;
import p402l.p406b.p407a.p422m.C9110c;
import p402l.p406b.p407a.p423n.C9113c;
import p402l.p406b.p425b.C9118b;
import p402l.p406b.p426c.C9130j;
import p402l.p406b.p426c.p428q.C9139c;
import p402l.p406b.p426c.p430s.C9171a;
import p402l.p406b.p426c.p435v.C9271c;
import p402l.p406b.p426c.p440y.C9298d;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: l.b.a.a */
/* compiled from: AudioFile */
public class C8942a {

    /* renamed from: d */
    public static Logger f35327d = Logger.getLogger("org.jaudiotagger.audio");

    /* renamed from: a */
    protected File f35328a;

    /* renamed from: b */
    protected C8944c f35329b;

    /* renamed from: c */
    protected C9130j f35330c;

    public C8942a() {
    }

    /* renamed from: f */
    public static String m47874f(File file) {
        int lastIndexOf = file.getName().toLowerCase().lastIndexOf(".");
        if (lastIndexOf > 0) {
            return file.getName().substring(0, lastIndexOf);
        }
        return file.getName();
    }

    /* renamed from: a */
    public void mo31264a(File file) throws FileNotFoundException {
        Logger logger = f35327d;
        logger.config("Reading file:path" + file.getPath() + ":abs:" + file.getAbsolutePath());
        if (!file.exists()) {
            Logger logger2 = f35327d;
            logger2.severe("Unable to find:" + file.getPath());
            throw new FileNotFoundException(C9118b.UNABLE_TO_FIND_FILE.getMsg(file.getPath()));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public RandomAccessFile mo31265b(File file, boolean z) throws C9022h, FileNotFoundException {
        mo31264a(file);
        if (z) {
            return new RandomAccessFile(file, "r");
        }
        if (file.canWrite()) {
            return new RandomAccessFile(file, "rw");
        }
        Logger logger = f35327d;
        logger.severe("Unable to write:" + file.getPath());
        throw new C9022h(C9118b.NO_PERMISSIONS_TO_WRITE_TO_FILE.getMsg(file.getPath()));
    }

    /* renamed from: c */
    public void mo31266c() throws C9017c {
        C8943b.m47888f(this);
    }

    /* renamed from: d */
    public C9130j mo31267d() {
        if (C8945d.FLAC.getFilesuffix().equals(this.f35328a.getName().substring(this.f35328a.getName().lastIndexOf(46)))) {
            return new C9171a(C9298d.m49285m(), new ArrayList());
        }
        if (C8945d.OGG.getFilesuffix().equals(this.f35328a.getName().substring(this.f35328a.getName().lastIndexOf(46)))) {
            return C9298d.m49285m();
        }
        if (C8945d.MP4.getFilesuffix().equals(this.f35328a.getName().substring(this.f35328a.getName().lastIndexOf(46)))) {
            return new C9271c();
        }
        if (C8945d.M4A.getFilesuffix().equals(this.f35328a.getName().substring(this.f35328a.getName().lastIndexOf(46)))) {
            return new C9271c();
        }
        if (C8945d.M4P.getFilesuffix().equals(this.f35328a.getName().substring(this.f35328a.getName().lastIndexOf(46)))) {
            return new C9271c();
        }
        if (C8945d.WMA.getFilesuffix().equals(this.f35328a.getName().substring(this.f35328a.getName().lastIndexOf(46)))) {
            return new C9139c();
        }
        if (C8945d.WAV.getFilesuffix().equals(this.f35328a.getName().substring(this.f35328a.getName().lastIndexOf(46)))) {
            return new C9113c();
        }
        if (C8945d.RA.getFilesuffix().equals(this.f35328a.getName().substring(this.f35328a.getName().lastIndexOf(46)))) {
            return new C9110c();
        }
        if (C8945d.RM.getFilesuffix().equals(this.f35328a.getName().substring(this.f35328a.getName().lastIndexOf(46)))) {
            return new C9110c();
        }
        if (C8945d.AIF.getFilesuffix().equals(this.f35328a.getName().substring(this.f35328a.getName().lastIndexOf(46)))) {
            return new C8950c();
        }
        throw new RuntimeException("Unable to create default tag for this file format");
    }

    /* renamed from: e */
    public C8944c mo31268e() {
        return this.f35329b;
    }

    /* renamed from: g */
    public File mo31269g() {
        return this.f35328a;
    }

    /* renamed from: h */
    public C9130j mo31270h() {
        return this.f35330c;
    }

    /* renamed from: i */
    public C9130j mo31271i() {
        C9130j j = mo31272j();
        mo31273k(j);
        return j;
    }

    /* renamed from: j */
    public C9130j mo31272j() {
        C9130j h = mo31270h();
        return h == null ? mo31267d() : h;
    }

    /* renamed from: k */
    public void mo31273k(C9130j jVar) {
        this.f35330c = jVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AudioFile ");
        sb.append(mo31269g().getAbsolutePath());
        sb.append("  --------\n");
        sb.append(this.f35329b.toString());
        sb.append("\n");
        C9130j jVar = this.f35330c;
        sb.append(jVar == null ? BuildConfig.FLAVOR : jVar.toString());
        sb.append("\n-------------------");
        return sb.toString();
    }

    public C8942a(File file, C8944c cVar, C9130j jVar) {
        this.f35328a = file;
        this.f35329b = cVar;
        this.f35330c = jVar;
    }
}
