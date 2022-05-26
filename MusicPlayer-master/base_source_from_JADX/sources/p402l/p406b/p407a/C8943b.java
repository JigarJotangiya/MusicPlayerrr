package p402l.p406b.p407a;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;
import p402l.p406b.p407a.p408e.C8949b;
import p402l.p406b.p407a.p409f.C8965a;
import p402l.p406b.p407a.p409f.C8966b;
import p402l.p406b.p407a.p413g.C9015a;
import p402l.p406b.p407a.p413g.C9017c;
import p402l.p406b.p407a.p413g.C9018d;
import p402l.p406b.p407a.p413g.C9022h;
import p402l.p406b.p407a.p414h.C9027b;
import p402l.p406b.p407a.p414h.C9028c;
import p402l.p406b.p407a.p416i.C9051d;
import p402l.p406b.p407a.p416i.C9052e;
import p402l.p406b.p407a.p416i.C9056h;
import p402l.p406b.p407a.p416i.C9057i;
import p402l.p406b.p407a.p417j.C9061d;
import p402l.p406b.p407a.p417j.C9062e;
import p402l.p406b.p407a.p418k.C9070e;
import p402l.p406b.p407a.p418k.C9071f;
import p402l.p406b.p407a.p420l.C9093a;
import p402l.p406b.p407a.p420l.C9094b;
import p402l.p406b.p407a.p422m.C9109b;
import p402l.p406b.p407a.p423n.C9111a;
import p402l.p406b.p407a.p423n.C9112b;
import p402l.p406b.p425b.C9118b;
import p402l.p406b.p426c.C9131k;

/* renamed from: l.b.a.b */
/* compiled from: AudioFileIO */
public class C8943b {

    /* renamed from: d */
    public static Logger f35331d = Logger.getLogger("org.jaudiotagger.audio");

    /* renamed from: e */
    private static C8943b f35332e;

    /* renamed from: a */
    private final C9056h f35333a = new C9056h();

    /* renamed from: b */
    private Map<String, C9051d> f35334b = new HashMap();

    /* renamed from: c */
    private Map<String, C9052e> f35335c = new HashMap();

    public C8943b() {
        m47886c();
    }

    /* renamed from: b */
    public static C8943b m47885b() {
        if (f35332e == null) {
            f35332e = new C8943b();
        }
        return f35332e;
    }

    /* renamed from: c */
    private void m47886c() {
        Map<String, C9051d> map = this.f35334b;
        C8945d dVar = C8945d.OGG;
        map.put(dVar.getFilesuffix(), new C9093a());
        Map<String, C9051d> map2 = this.f35334b;
        C8945d dVar2 = C8945d.FLAC;
        map2.put(dVar2.getFilesuffix(), new C9027b());
        Map<String, C9051d> map3 = this.f35334b;
        C8945d dVar3 = C8945d.MP3;
        map3.put(dVar3.getFilesuffix(), new C9061d());
        Map<String, C9051d> map4 = this.f35334b;
        C8945d dVar4 = C8945d.MP4;
        map4.put(dVar4.getFilesuffix(), new C9070e());
        Map<String, C9051d> map5 = this.f35334b;
        C8945d dVar5 = C8945d.M4A;
        map5.put(dVar5.getFilesuffix(), new C9070e());
        Map<String, C9051d> map6 = this.f35334b;
        C8945d dVar6 = C8945d.M4P;
        map6.put(dVar6.getFilesuffix(), new C9070e());
        Map<String, C9051d> map7 = this.f35334b;
        C8945d dVar7 = C8945d.M4B;
        map7.put(dVar7.getFilesuffix(), new C9070e());
        Map<String, C9051d> map8 = this.f35334b;
        C8945d dVar8 = C8945d.WAV;
        map8.put(dVar8.getFilesuffix(), new C9111a());
        Map<String, C9051d> map9 = this.f35334b;
        C8945d dVar9 = C8945d.WMA;
        map9.put(dVar9.getFilesuffix(), new C8965a());
        this.f35334b.put(C8945d.AIF.getFilesuffix(), new C8949b());
        C9109b bVar = new C9109b();
        this.f35334b.put(C8945d.RA.getFilesuffix(), bVar);
        this.f35334b.put(C8945d.RM.getFilesuffix(), bVar);
        this.f35335c.put(dVar.getFilesuffix(), new C9094b());
        this.f35335c.put(dVar2.getFilesuffix(), new C9028c());
        this.f35335c.put(dVar3.getFilesuffix(), new C9062e());
        this.f35335c.put(dVar4.getFilesuffix(), new C9071f());
        this.f35335c.put(dVar5.getFilesuffix(), new C9071f());
        this.f35335c.put(dVar6.getFilesuffix(), new C9071f());
        this.f35335c.put(dVar7.getFilesuffix(), new C9071f());
        this.f35335c.put(dVar8.getFilesuffix(), new C9112b());
        this.f35335c.put(dVar9.getFilesuffix(), new C8966b());
        this.f35335c.values().iterator();
        for (C9052e d : this.f35335c.values()) {
            d.mo31540d(this.f35333a);
        }
    }

    /* renamed from: d */
    public static C8942a m47887d(File file) throws C9015a, IOException, C9131k, C9022h, C9018d {
        return m47885b().mo31276e(file);
    }

    /* renamed from: f */
    public static void m47888f(C8942a aVar) throws C9017c {
        m47885b().mo31277g(aVar);
    }

    /* renamed from: a */
    public void mo31275a(File file) throws FileNotFoundException {
        Logger logger = f35331d;
        logger.config("Reading file:path" + file.getPath() + ":abs:" + file.getAbsolutePath());
        if (!file.exists()) {
            Logger logger2 = f35331d;
            logger2.severe("Unable to find:" + file.getPath());
            throw new FileNotFoundException(C9118b.UNABLE_TO_FIND_FILE.getMsg(file.getPath()));
        }
    }

    /* renamed from: e */
    public C8942a mo31276e(File file) throws C9015a, IOException, C9131k, C9022h, C9018d {
        mo31275a(file);
        String d = C9057i.m48301d(file);
        C9051d dVar = this.f35334b.get(d);
        if (dVar != null) {
            return dVar.mo31298c(file);
        }
        throw new C9015a(C9118b.NO_READER_FOR_THIS_FORMAT.getMsg(d));
    }

    /* renamed from: g */
    public void mo31277g(C8942a aVar) throws C9017c {
        String d = C9057i.m48301d(aVar.mo31269g());
        C9052e eVar = this.f35335c.get(d);
        if (eVar != null) {
            eVar.mo31541e(aVar);
            return;
        }
        throw new C9017c(C9118b.NO_WRITER_FOR_THIS_FORMAT.getMsg(d));
    }
}
