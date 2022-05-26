package p402l.p406b.p407a.p416i;

import java.util.HashMap;
import p402l.p406b.p407a.C8944c;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: l.b.a.i.f */
/* compiled from: GenericAudioHeader */
public class C9053f implements C8944c {

    /* renamed from: a */
    protected HashMap<String, Object> f35532a;

    public C9053f() {
        HashMap<String, Object> hashMap = new HashMap<>(6);
        this.f35532a = hashMap;
        hashMap.put("BITRATE", -1);
        this.f35532a.put("CHANNB", -1);
        this.f35532a.put("TYPE", BuildConfig.FLAVOR);
        this.f35532a.put("INFOS", BuildConfig.FLAVOR);
        this.f35532a.put("SAMPLING", -1);
        this.f35532a.put("BITSPERSAMPLE", -1);
        this.f35532a.put("LENGTH", Float.valueOf(-1.0f));
        this.f35532a.put("VBR", Boolean.TRUE);
    }

    /* renamed from: a */
    public long mo31542a() {
        return ((Integer) this.f35532a.get("BITRATE")).longValue();
    }

    /* renamed from: b */
    public int mo31543b() {
        return ((Integer) this.f35532a.get("BITSPERSAMPLE")).intValue();
    }

    /* renamed from: c */
    public int mo31544c() {
        return ((Integer) this.f35532a.get("CHANNB")).intValue();
    }

    /* renamed from: d */
    public String mo31545d() {
        return (String) this.f35532a.get("TYPE");
    }

    /* renamed from: e */
    public float mo31546e() {
        return ((Float) this.f35532a.get("LENGTH")).floatValue();
    }

    /* renamed from: f */
    public int mo31547f() {
        return (int) mo31546e();
    }

    /* renamed from: g */
    public void mo31548g(int i) {
        this.f35532a.put("BITRATE", Integer.valueOf(i));
    }

    /* renamed from: h */
    public void mo31549h(int i) {
        this.f35532a.put("BITSPERSAMPLE", Integer.valueOf(i));
    }

    /* renamed from: i */
    public void mo31550i(int i) {
        this.f35532a.put("CHANNB", Integer.valueOf(i));
    }

    /* renamed from: j */
    public void mo31551j(String str) {
        this.f35532a.put("TYPE", str);
    }

    /* renamed from: k */
    public void mo31552k(String str) {
        this.f35532a.put("INFOS", str);
    }

    /* renamed from: l */
    public void mo31553l(int i) {
        this.f35532a.put("LENGTH", Float.valueOf((float) i));
    }

    /* renamed from: m */
    public void mo31554m(boolean z) {
    }

    /* renamed from: n */
    public void mo31555n(float f) {
        this.f35532a.put("LENGTH", Float.valueOf(f));
    }

    /* renamed from: o */
    public void mo31556o(int i) {
        this.f35532a.put("SAMPLING", Integer.valueOf(i));
    }

    /* renamed from: p */
    public void mo31557p(boolean z) {
        this.f35532a.put("VBR", Boolean.valueOf(z));
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(50);
        stringBuffer.append("Encoding infos content:\n");
        for (String next : this.f35532a.keySet()) {
            Object obj = this.f35532a.get(next);
            stringBuffer.append("\t");
            stringBuffer.append(next);
            stringBuffer.append(" : ");
            stringBuffer.append(obj);
            stringBuffer.append("\n");
        }
        return stringBuffer.toString().substring(0, stringBuffer.length() - 1);
    }
}
