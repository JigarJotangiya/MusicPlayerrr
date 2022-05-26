package com.coocent.videostore.p066db;

import androidx.lifecycle.LiveData;
import com.coocent.videostore.p067po.Video;
import java.util.Collection;
import java.util.List;
import p082e.p149u.p150a.C4221e;
import p369i.C8457t;
import p369i.p379w.C8508d;

/* renamed from: com.coocent.videostore.db.c */
/* compiled from: VideoDao.kt */
public interface C2799c {
    /* renamed from: a */
    Object mo10400a(C8508d<? super List<? extends Video>> dVar);

    /* renamed from: b */
    LiveData<List<Video>> mo10401b(C4221e eVar);

    /* renamed from: c */
    Object mo10402c(Video video, C8508d<? super Integer> dVar);

    /* renamed from: d */
    Object mo10403d(Video video, C8508d<? super C8457t> dVar);

    /* renamed from: e */
    Object mo10404e(String str, C8508d<? super List<? extends Video>> dVar);

    /* renamed from: f */
    LiveData<List<Video>> mo10405f(C4221e eVar);

    /* renamed from: g */
    Video mo10406g(int i);

    /* renamed from: h */
    Object mo10407h(long j, long j2, C8508d<? super C8457t> dVar);

    /* renamed from: i */
    Object mo10408i(long j, long j2, C8508d<? super C8457t> dVar);

    /* renamed from: j */
    Object mo10409j(long j, String str, String str2, String str3, C8508d<? super Integer> dVar);

    /* renamed from: k */
    Object mo10410k(long j, long j2, int i, int i2, String str, C8508d<? super Integer> dVar);

    /* renamed from: l */
    LiveData<List<Video>> mo10411l(C4221e eVar);

    /* renamed from: m */
    LiveData<Video> mo10412m(long j);

    /* renamed from: n */
    Object mo10413n(Collection<? extends Video> collection, C8508d<? super C8457t> dVar);

    /* renamed from: o */
    Object mo10414o(long j, boolean z, C8508d<? super C8457t> dVar);

    /* renamed from: p */
    LiveData<Video> mo10415p(String str);

    /* renamed from: q */
    Object mo10416q(Video video, C8508d<? super Integer> dVar);

    /* renamed from: r */
    LiveData<List<Video>> mo10417r(C4221e eVar);
}
