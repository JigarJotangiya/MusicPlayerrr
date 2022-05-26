package p342g.p343a.p344a.p358i;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Parcelable;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.coocent.music.base.data.entity.Music;
import com.coocent.videoplayer.VideoPlayerActivity;
import com.coocent.videoplayer.bean.VideoConfigBean;
import com.coocent.videostore.p067po.Video;
import com.google.android.gms.ads.AdView;
import java.util.ArrayList;
import java.util.List;
import net.coocent.android.xmlparser.ads.AdHelper;
import net.coocent.android.xmlparser.p461z.C9564d;
import p159f.p166c.p181e.p182a.p190b.p197l.C4477c;
import p159f.p166c.p222m.C4613a;
import p342g.p343a.p344a.p355g.C8287e;
import p369i.C8457t;
import p369i.p387z.p388c.C8570l;
import p369i.p387z.p389d.C8594l;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: g.a.a.i.v */
/* compiled from: VideoConfig.kt */
public final class C8346v implements C4613a {

    /* renamed from: a */
    private AdView f34793a;

    /* renamed from: p */
    private final List<Music> m46341p(List<Video> list) {
        ArrayList arrayList = new ArrayList();
        int size = list.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                Music music = new Music();
                music.mo9231y(list.get(i).mo10553l());
                music.mo9202C(list.get(i).mo10565w());
                String str = BuildConfig.FLAVOR;
                music.mo9224t(str);
                music.mo9226u(list.get(i).mo10561t());
                music.mo9230x((int) list.get(i).mo10547g());
                music.mo9200A(list.get(i).mo10563u());
                if (list.get(i).mo10567x() != null) {
                    str = list.get(i).mo10567x();
                }
                Uri parse = Uri.parse(str);
                C8594l.m46770d(parse, "parse(if (videoList[j].uriString == null) \"\" else videoList[j].uriString)");
                music.mo9203D(parse);
                Context h = C8345u.m46327h();
                C8594l.m46770d(h, "getContext()");
                C4477c.m19576H0(h, list.get(i).mo10553l(), 0, list.get(i).mo10564v());
                music.mo9262b(7);
                arrayList.add(music);
                if (i2 > size) {
                    break;
                }
                i = i2;
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static final void m46343r(Parcelable parcelable) {
        C8594l.m46771e(parcelable, "$p");
        C8345u.m46327h().sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.update_page").setPackage(C8345u.m46327h().getPackageName()));
        C8287e.m45856m0(((VideoConfigBean) parcelable).mo10213d() / 1000);
    }

    /* renamed from: a */
    public void mo15355a(Application application) {
        C8594l.m46771e(application, "application");
    }

    /* renamed from: b */
    public void mo15356b(Context context, String str) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(str, "path");
        C9564d.m50178d(context, str, "MusicPlayer16");
    }

    /* renamed from: c */
    public int mo15357c() {
        return 1;
    }

    /* renamed from: d */
    public void mo15358d(Context context, Parcelable parcelable) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(parcelable, "p");
        if (parcelable instanceof VideoConfigBean) {
            VideoConfigBean videoConfigBean = (VideoConfigBean) parcelable;
            List<Music> p = m46341p(videoConfigBean.mo10211a());
            C8287e.m45781F0(1, (ImageView) null, 0, false);
            C8287e.m45823a0(videoConfigBean.mo10212b(), p);
            new Handler().postDelayed(new C8310b(parcelable), 500);
        }
    }

    /* renamed from: e */
    public void mo15359e(ViewGroup viewGroup) {
        C8594l.m46771e(viewGroup, "viewGroup");
    }

    /* renamed from: f */
    public void mo15360f(Context context, Parcelable parcelable) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(parcelable, "p");
        if (parcelable instanceof VideoConfigBean) {
            VideoPlayerActivity.f9179Z.mo10202a(context, (VideoConfigBean) parcelable);
        }
    }

    /* renamed from: g */
    public void mo15361g(ViewGroup viewGroup) {
        C8594l.m46771e(viewGroup, "viewGroup");
        try {
            Context context = viewGroup.getContext();
            if (context != null) {
                this.f34793a = AdHelper.m49536p().mo32441b(context, viewGroup);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: h */
    public boolean mo15362h() {
        return false;
    }

    /* renamed from: i */
    public void mo15363i(Context context, int i, List<Parcelable> list, List<Parcelable> list2) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(list, "operateList");
        C8594l.m46771e(list2, "videoList");
        C4613a.C4614a.m20079c(this, context, i, list, list2);
        if (i == 1) {
            try {
                if (list.size() == 1 && (list.get(0) instanceof Video)) {
                    List<Music> s = C8287e.m45867s();
                    Video video = (Video) list.get(0);
                    for (Music next : s) {
                        if (video.mo10553l() == next.mo9215k()) {
                            next.mo9202C(video.mo10565w());
                            if (C8287e.m45873v().mo9215k() == video.mo10553l()) {
                                C8287e.m45873v().mo9202C(video.mo10565w());
                            }
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        } else {
            if (i != 0) {
                if (i != 2) {
                    if (i == 3) {
                        List<Music> s2 = C8287e.m45867s();
                        s2.clear();
                        s2.addAll(m46341p(list2));
                    }
                }
            }
            List<Music> s3 = C8287e.m45867s();
            Music v = C8287e.m45873v();
            s3.clear();
            s3.addAll(m46341p(list2));
            ArrayList arrayList = new ArrayList();
            for (T next2 : list) {
                if (((Video) next2).mo10553l() == v.mo9215k()) {
                    arrayList.add(next2);
                }
            }
            if (!arrayList.isEmpty()) {
                C8287e.m45832d0();
            }
        }
        context.sendBroadcast(new Intent("media.musicplayer.audioplayer.videoplayer.update_video_list"));
    }

    /* renamed from: j */
    public boolean mo15364j(Application application, boolean z) {
        C8594l.m46771e(application, "application");
        return false;
    }

    /* renamed from: k */
    public void mo15365k(ViewGroup viewGroup) {
        C8594l.m46771e(viewGroup, "viewGroup");
        AdView adView = this.f34793a;
        if (adView != null) {
            C8594l.m46769c(adView);
            adView.mo11151a();
        }
        viewGroup.removeAllViews();
    }

    /* renamed from: l */
    public boolean mo15366l() {
        return false;
    }

    /* renamed from: m */
    public void mo15367m(Activity activity, List<? extends Parcelable> list, C8570l<? super List<? extends Parcelable>, C8457t> lVar) {
        C4613a.C4614a.m20077a(this, activity, list, lVar);
    }

    /* renamed from: n */
    public void mo15368n(Activity activity) {
        C8594l.m46771e(activity, "activity");
        AdHelper.m49536p().mo32458u(activity);
    }

    /* renamed from: o */
    public void mo15369o(Context context, Parcelable parcelable) {
        C4613a.C4614a.m20078b(this, context, parcelable);
    }
}
