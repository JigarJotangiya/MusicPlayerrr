package com.coocent.videoplayer.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.coocent.videostore.p067po.Video;
import java.util.ArrayList;
import java.util.List;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;

/* compiled from: VideoConfigBean.kt */
public final class VideoConfigBean implements Parcelable {
    public static final Parcelable.Creator<VideoConfigBean> CREATOR = new C2692b();

    /* renamed from: g */
    private int f9210g;

    /* renamed from: h */
    private Video f9211h;

    /* renamed from: i */
    private int f9212i;

    /* renamed from: j */
    private List<Video> f9213j;

    /* renamed from: k */
    private float f9214k;

    /* renamed from: l */
    private int f9215l;

    /* renamed from: m */
    private long f9216m;

    /* renamed from: n */
    private boolean f9217n;

    /* renamed from: o */
    private boolean f9218o;

    /* renamed from: p */
    private boolean f9219p;

    /* renamed from: q */
    private boolean f9220q;

    /* renamed from: r */
    private boolean f9221r;

    /* renamed from: s */
    private boolean f9222s;

    /* renamed from: t */
    private int f9223t;

    /* renamed from: com.coocent.videoplayer.bean.VideoConfigBean$a */
    /* compiled from: VideoConfigBean.kt */
    public static final class C2691a {

        /* renamed from: a */
        public int f9224a;

        /* renamed from: b */
        public Video f9225b = new Video();

        /* renamed from: c */
        public int f9226c;

        /* renamed from: d */
        public List<Video> f9227d = new ArrayList();

        /* renamed from: e */
        public float f9228e;

        /* renamed from: f */
        public int f9229f;

        /* renamed from: g */
        public long f9230g;

        /* renamed from: h */
        public boolean f9231h;

        /* renamed from: i */
        public boolean f9232i;

        /* renamed from: j */
        public boolean f9233j = true;

        /* renamed from: k */
        public boolean f9234k = true;

        /* renamed from: l */
        public boolean f9235l = true;

        /* renamed from: m */
        public boolean f9236m = true;

        /* renamed from: n */
        public int f9237n;

        /* renamed from: a */
        public final VideoConfigBean mo10223a() {
            return new VideoConfigBean(this.f9224a, this.f9225b, this.f9226c, this.f9227d, this.f9228e, this.f9229f, this.f9230g, this.f9231h, this.f9232i, this.f9233j, this.f9234k, this.f9235l, this.f9236m, this.f9237n, (C8589g) null);
        }

        /* renamed from: b */
        public final C2691a mo10224b(boolean z) {
            this.f9231h = z;
            return this;
        }

        /* renamed from: c */
        public final C2691a mo10225c(boolean z) {
            this.f9234k = z;
            return this;
        }

        /* renamed from: d */
        public final C2691a mo10226d(boolean z) {
            this.f9233j = z;
            return this;
        }

        /* renamed from: e */
        public final C2691a mo10227e(int i, long j) {
            this.f9229f = i;
            this.f9230g = j;
            return this;
        }

        /* renamed from: f */
        public final C2691a mo10228f(float f) {
            this.f9228e = f;
            return this;
        }

        /* renamed from: g */
        public final C2691a mo10229g(List<Video> list) {
            C8594l.m46771e(list, "videoList");
            this.f9227d = list;
            return this;
        }

        /* renamed from: h */
        public final C2691a mo10230h(Video video) {
            C8594l.m46771e(video, "videoPlay");
            this.f9225b = video;
            return this;
        }

        /* renamed from: i */
        public final C2691a mo10231i(int i) {
            this.f9224a = i;
            return this;
        }

        /* renamed from: j */
        public final C2691a mo10232j(int i) {
            this.f9226c = i;
            return this;
        }
    }

    /* renamed from: com.coocent.videoplayer.bean.VideoConfigBean$b */
    /* compiled from: VideoConfigBean.kt */
    public static final class C2692b implements Parcelable.Creator<VideoConfigBean> {
        /* renamed from: a */
        public final VideoConfigBean createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            C8594l.m46771e(parcel2, "parcel");
            int readInt = parcel.readInt();
            Video video = (Video) parcel2.readParcelable(VideoConfigBean.class.getClassLoader());
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt3);
            for (int i = 0; i != readInt3; i++) {
                arrayList.add(parcel2.readParcelable(VideoConfigBean.class.getClassLoader()));
            }
            return new VideoConfigBean(readInt, video, readInt2, arrayList, parcel.readFloat(), parcel.readInt(), parcel.readLong(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt(), (C8589g) null);
        }

        /* renamed from: b */
        public final VideoConfigBean[] newArray(int i) {
            return new VideoConfigBean[i];
        }
    }

    private VideoConfigBean(int i, Video video, int i2, List<Video> list, float f, int i3, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i4) {
        this.f9210g = i;
        this.f9211h = video;
        this.f9212i = i2;
        this.f9213j = list;
        this.f9214k = f;
        this.f9215l = i3;
        this.f9216m = j;
        this.f9217n = z;
        this.f9218o = z2;
        this.f9219p = z3;
        this.f9220q = z4;
        this.f9221r = z5;
        this.f9222s = z6;
        this.f9223t = i4;
    }

    public /* synthetic */ VideoConfigBean(int i, Video video, int i2, List list, float f, int i3, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i4, C8589g gVar) {
        this(i, video, i2, list, f, i3, j, z, z2, z3, z4, z5, z6, i4);
    }

    /* renamed from: a */
    public final List<Video> mo10211a() {
        return this.f9213j;
    }

    /* renamed from: b */
    public final int mo10212b() {
        return this.f9210g;
    }

    /* renamed from: d */
    public final int mo10213d() {
        return this.f9212i;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final int mo10215e() {
        return this.f9223t;
    }

    /* renamed from: f */
    public final boolean mo10216f() {
        return this.f9221r;
    }

    /* renamed from: g */
    public final boolean mo10217g() {
        return this.f9218o;
    }

    /* renamed from: h */
    public final boolean mo10218h() {
        return this.f9220q;
    }

    /* renamed from: i */
    public final boolean mo10219i() {
        return this.f9222s;
    }

    /* renamed from: j */
    public final boolean mo10220j() {
        return this.f9219p;
    }

    public String toString() {
        return "VideoConfigBeanNew(videoPosition=" + this.f9210g + ", videoPlay=" + this.f9211h + ", videoSchedule=" + this.f9212i + ", videoList=" + this.f9213j + ", speed=" + this.f9214k + ", sleepMode=" + this.f9215l + ", sleepTimeMs=" + this.f9216m + ", isBackgroundPlay=" + this.f9217n + ", isNetworkStream=" + this.f9218o + ", isShowWindowBtn=" + this.f9219p + ", isShowAudioBtn=" + this.f9220q + ", isMusicPlaying=" + this.f9221r + ", isShowPlayListBtn=" + this.f9222s + ", isAppType=" + this.f9223t + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C8594l.m46771e(parcel, "out");
        parcel.writeInt(this.f9210g);
        parcel.writeParcelable(this.f9211h, i);
        parcel.writeInt(this.f9212i);
        List<Video> list = this.f9213j;
        parcel.writeInt(list.size());
        for (Video writeParcelable : list) {
            parcel.writeParcelable(writeParcelable, i);
        }
        parcel.writeFloat(this.f9214k);
        parcel.writeInt(this.f9215l);
        parcel.writeLong(this.f9216m);
        parcel.writeInt(this.f9217n ? 1 : 0);
        parcel.writeInt(this.f9218o ? 1 : 0);
        parcel.writeInt(this.f9219p ? 1 : 0);
        parcel.writeInt(this.f9220q ? 1 : 0);
        parcel.writeInt(this.f9221r ? 1 : 0);
        parcel.writeInt(this.f9222s ? 1 : 0);
        parcel.writeInt(this.f9223t);
    }
}
