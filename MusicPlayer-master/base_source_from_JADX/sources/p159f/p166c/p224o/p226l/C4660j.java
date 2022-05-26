package p159f.p166c.p224o.p226l;

import androidx.fragment.app.C0602j;
import androidx.fragment.app.C0620p;
import androidx.fragment.app.Fragment;
import com.coocent.videolibrary.p058ui.folder.C2611l;
import com.coocent.videolibrary.p058ui.p059i.C2650q;
import com.coocent.videoplayer.bean.VideoConfigBean;
import p369i.p387z.p389d.C8594l;

/* renamed from: f.c.o.l.j */
/* compiled from: FragmentManagerExtensions.kt */
public final class C4660j {
    /* renamed from: a */
    public static final void m20161a(C0602j jVar, int i, int i2, VideoConfigBean videoConfigBean) {
        C8594l.m46771e(jVar, "<this>");
        C0620p i3 = jVar.mo3957i();
        C8594l.m46770d(i3, "beginTransaction()");
        if (i2 == 1) {
            Fragment Y = jVar.mo3938Y(C2650q.f9118E0.mo10158a());
            if (Y != null) {
                i3.mo3821p(Y);
            }
            C2611l.C2612a aVar = C2611l.f9062t0;
            Fragment Y2 = jVar.mo3938Y(aVar.mo10119a());
            if (Y2 == null) {
                i3.mo4069c(i, new C2611l(), aVar.mo10119a());
            } else {
                i3.mo3826v(Y2);
            }
        } else {
            Fragment Y3 = jVar.mo3938Y(C2611l.f9062t0.mo10119a());
            if (Y3 != null) {
                i3.mo3821p(Y3);
            }
            C2650q.C2651a aVar2 = C2650q.f9118E0;
            Fragment Y4 = jVar.mo3938Y(aVar2.mo10158a());
            if (Y4 == null) {
                i3.mo4069c(i, C2650q.C2651a.m12152c(aVar2, (String) null, 0, false, videoConfigBean, 7, (Object) null), aVar2.mo10158a());
            } else {
                i3.mo3826v(Y4);
            }
        }
        i3.mo3815i();
    }
}
