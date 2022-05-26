package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.List;
import p159f.p243f.p245b.p318c.p319a.p320a.C7606o0;
import p159f.p243f.p245b.p318c.p319a.p323d.C7643p;

/* renamed from: com.google.android.play.core.assetpacks.m */
/* compiled from: com.google.android.play:core@@1.10.2 */
class C6384m<T> extends C7606o0 {

    /* renamed from: g */
    final C7643p<T> f29568g;

    /* renamed from: h */
    final /* synthetic */ C6424u f29569h;

    C6384m(C6424u uVar, C7643p<T> pVar) {
        this.f29569h = uVar;
        this.f29568g = pVar;
    }

    /* renamed from: E6 */
    public final void mo25314E6(int i, Bundle bundle) {
        this.f29569h.f29665d.mo28606s(this.f29568g);
        C6424u.f29660g.mo28577d("onGetSession(%d)", Integer.valueOf(i));
    }

    /* renamed from: R0 */
    public void mo25315R0(Bundle bundle, Bundle bundle2) throws RemoteException {
        this.f29569h.f29665d.mo28606s(this.f29568g);
        C6424u.f29660g.mo28577d("onGetChunkFileDescriptor", new Object[0]);
    }

    /* renamed from: W4 */
    public final void mo25316W4(Bundle bundle, Bundle bundle2) {
        this.f29569h.f29665d.mo28606s(this.f29568g);
        C6424u.f29660g.mo28577d("onNotifySessionFailed(%d)", Integer.valueOf(bundle.getInt("session_id")));
    }

    /* renamed from: W5 */
    public void mo25317W5(Bundle bundle, Bundle bundle2) {
        this.f29569h.f29665d.mo28606s(this.f29568g);
        C6424u.f29660g.mo28577d("onKeepAlive(%b)", Boolean.valueOf(bundle.getBoolean("keep_alive")));
    }

    /* renamed from: c7 */
    public final void mo25318c7(Bundle bundle, Bundle bundle2) {
        this.f29569h.f29665d.mo28606s(this.f29568g);
        C6424u.f29660g.mo28577d("onNotifyChunkTransferred(%s, %s, %d, session=%d)", bundle.getString("module_name"), bundle.getString("slice_id"), Integer.valueOf(bundle.getInt("chunk_number")), Integer.valueOf(bundle.getInt("session_id")));
    }

    /* renamed from: e1 */
    public void mo25319e1(List<Bundle> list) {
        this.f29569h.f29665d.mo28606s(this.f29568g);
        C6424u.f29660g.mo28577d("onGetSessionStates", new Object[0]);
    }

    /* renamed from: g0 */
    public final void mo25320g0(int i, Bundle bundle) {
        this.f29569h.f29665d.mo28606s(this.f29568g);
        C6424u.f29660g.mo28577d("onCancelDownload(%d)", Integer.valueOf(i));
    }

    /* renamed from: g6 */
    public void mo25321g6(int i, Bundle bundle) {
        this.f29569h.f29665d.mo28606s(this.f29568g);
        C6424u.f29660g.mo28577d("onStartDownload(%d)", Integer.valueOf(i));
    }

    /* renamed from: l0 */
    public void mo25322l0(Bundle bundle) {
        this.f29569h.f29665d.mo28606s(this.f29568g);
        int i = bundle.getInt("error_code");
        C6424u.f29660g.mo28575b("onError(%d)", Integer.valueOf(i));
        this.f29568g.mo28635d(new C6317a(i));
    }

    /* renamed from: q3 */
    public void mo25323q3(Bundle bundle, Bundle bundle2) {
        this.f29569h.f29665d.mo28606s(this.f29568g);
        C6424u.f29660g.mo28577d("onRequestDownloadInfo()", new Object[0]);
    }

    /* renamed from: q4 */
    public final void mo25324q4(Bundle bundle, Bundle bundle2) {
        this.f29569h.f29665d.mo28606s(this.f29568g);
        C6424u.f29660g.mo28577d("onNotifyModuleCompleted(%s, sessionId=%d)", bundle.getString("module_name"), Integer.valueOf(bundle.getInt("session_id")));
    }

    /* renamed from: r0 */
    public final void mo25325r0(Bundle bundle) {
        this.f29569h.f29665d.mo28606s(this.f29568g);
        C6424u.f29660g.mo28577d("onCancelDownloads()", new Object[0]);
    }

    /* renamed from: z2 */
    public final void mo25326z2(Bundle bundle, Bundle bundle2) {
        this.f29569h.f29665d.mo28606s(this.f29568g);
        C6424u.f29660g.mo28577d("onRemoveModule()", new Object[0]);
    }
}
