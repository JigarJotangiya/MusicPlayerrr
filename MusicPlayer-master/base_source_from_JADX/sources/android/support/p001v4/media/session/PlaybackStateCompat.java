package android.support.p001v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.session.PlaybackStateCompat */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new C0064a();

    /* renamed from: g */
    final int f167g;

    /* renamed from: h */
    final long f168h;

    /* renamed from: i */
    final long f169i;

    /* renamed from: j */
    final float f170j;

    /* renamed from: k */
    final long f171k;

    /* renamed from: l */
    final int f172l;

    /* renamed from: m */
    final CharSequence f173m;

    /* renamed from: n */
    final long f174n;

    /* renamed from: o */
    List<CustomAction> f175o;

    /* renamed from: p */
    final long f176p;

    /* renamed from: q */
    final Bundle f177q;

    /* renamed from: r */
    private PlaybackState f178r;

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$a */
    class C0064a implements Parcelable.Creator<PlaybackStateCompat> {
        C0064a() {
        }

        /* renamed from: a */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        /* renamed from: b */
        public PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.f167g = i;
        this.f168h = j;
        this.f169i = j2;
        this.f170j = f;
        this.f171k = j3;
        this.f172l = i2;
        this.f173m = charSequence;
        this.f174n = j4;
        this.f175o = new ArrayList(list);
        this.f176p = j5;
        this.f177q = bundle;
    }

    /* renamed from: a */
    public static PlaybackStateCompat m350a(Object obj) {
        ArrayList arrayList;
        Bundle bundle = null;
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) obj;
        List<PlaybackState.CustomAction> customActions = playbackState.getCustomActions();
        if (customActions != null) {
            ArrayList arrayList2 = new ArrayList(customActions.size());
            for (PlaybackState.CustomAction a : customActions) {
                arrayList2.add(CustomAction.m358a(a));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (Build.VERSION.SDK_INT >= 22) {
            bundle = playbackState.getExtras();
            MediaSessionCompat.m149b(bundle);
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(playbackState.getState(), playbackState.getPosition(), playbackState.getBufferedPosition(), playbackState.getPlaybackSpeed(), playbackState.getActions(), 0, playbackState.getErrorMessage(), playbackState.getLastPositionUpdateTime(), arrayList, playbackState.getActiveQueueItemId(), bundle);
        playbackStateCompat.f178r = playbackState;
        return playbackStateCompat;
    }

    /* renamed from: i */
    public static int m351i(long j) {
        if (j == 4) {
            return 126;
        }
        if (j == 2) {
            return 127;
        }
        if (j == 32) {
            return 87;
        }
        if (j == 16) {
            return 88;
        }
        if (j == 1) {
            return 86;
        }
        if (j == 64) {
            return 90;
        }
        if (j == 8) {
            return 89;
        }
        return j == 512 ? 85 : 0;
    }

    /* renamed from: b */
    public long mo340b() {
        return this.f171k;
    }

    /* renamed from: d */
    public long mo341d() {
        return this.f174n;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public float mo343e() {
        return this.f170j;
    }

    /* renamed from: f */
    public Object mo344f() {
        if (this.f178r == null && Build.VERSION.SDK_INT >= 21) {
            PlaybackState.Builder builder = new PlaybackState.Builder();
            builder.setState(this.f167g, this.f168h, this.f170j, this.f174n);
            builder.setBufferedPosition(this.f169i);
            builder.setActions(this.f171k);
            builder.setErrorMessage(this.f173m);
            for (CustomAction b : this.f175o) {
                builder.addCustomAction((PlaybackState.CustomAction) b.mo349b());
            }
            builder.setActiveQueueItemId(this.f176p);
            if (Build.VERSION.SDK_INT >= 22) {
                builder.setExtras(this.f177q);
            }
            this.f178r = builder.build();
        }
        return this.f178r;
    }

    /* renamed from: g */
    public long mo345g() {
        return this.f168h;
    }

    /* renamed from: h */
    public int mo346h() {
        return this.f167g;
    }

    public String toString() {
        return "PlaybackState {" + "state=" + this.f167g + ", position=" + this.f168h + ", buffered position=" + this.f169i + ", speed=" + this.f170j + ", updated=" + this.f174n + ", actions=" + this.f171k + ", error code=" + this.f172l + ", error message=" + this.f173m + ", custom actions=" + this.f175o + ", active item id=" + this.f176p + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f167g);
        parcel.writeLong(this.f168h);
        parcel.writeFloat(this.f170j);
        parcel.writeLong(this.f174n);
        parcel.writeLong(this.f169i);
        parcel.writeLong(this.f171k);
        TextUtils.writeToParcel(this.f173m, parcel, i);
        parcel.writeTypedList(this.f175o);
        parcel.writeLong(this.f176p);
        parcel.writeBundle(this.f177q);
        parcel.writeInt(this.f172l);
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$b */
    public static final class C0065b {

        /* renamed from: a */
        private final List<CustomAction> f184a;

        /* renamed from: b */
        private int f185b;

        /* renamed from: c */
        private long f186c;

        /* renamed from: d */
        private long f187d;

        /* renamed from: e */
        private float f188e;

        /* renamed from: f */
        private long f189f;

        /* renamed from: g */
        private int f190g;

        /* renamed from: h */
        private CharSequence f191h;

        /* renamed from: i */
        private long f192i;

        /* renamed from: j */
        private long f193j;

        /* renamed from: k */
        private Bundle f194k;

        public C0065b() {
            this.f184a = new ArrayList();
            this.f193j = -1;
        }

        /* renamed from: a */
        public PlaybackStateCompat mo361a() {
            return new PlaybackStateCompat(this.f185b, this.f186c, this.f187d, this.f188e, this.f189f, this.f190g, this.f191h, this.f192i, this.f184a, this.f193j, this.f194k);
        }

        /* renamed from: b */
        public C0065b mo362b(long j) {
            this.f189f = j;
            return this;
        }

        /* renamed from: c */
        public C0065b mo363c(int i, long j, float f) {
            mo364d(i, j, f, SystemClock.elapsedRealtime());
            return this;
        }

        /* renamed from: d */
        public C0065b mo364d(int i, long j, float f, long j2) {
            this.f185b = i;
            this.f186c = j;
            this.f192i = j2;
            this.f188e = f;
            return this;
        }

        public C0065b(PlaybackStateCompat playbackStateCompat) {
            ArrayList arrayList = new ArrayList();
            this.f184a = arrayList;
            this.f193j = -1;
            this.f185b = playbackStateCompat.f167g;
            this.f186c = playbackStateCompat.f168h;
            this.f188e = playbackStateCompat.f170j;
            this.f192i = playbackStateCompat.f174n;
            this.f187d = playbackStateCompat.f169i;
            this.f189f = playbackStateCompat.f171k;
            this.f190g = playbackStateCompat.f172l;
            this.f191h = playbackStateCompat.f173m;
            List<CustomAction> list = playbackStateCompat.f175o;
            if (list != null) {
                arrayList.addAll(list);
            }
            this.f193j = playbackStateCompat.f176p;
            this.f194k = playbackStateCompat.f177q;
        }
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new C0063a();

        /* renamed from: g */
        private final String f179g;

        /* renamed from: h */
        private final CharSequence f180h;

        /* renamed from: i */
        private final int f181i;

        /* renamed from: j */
        private final Bundle f182j;

        /* renamed from: k */
        private PlaybackState.CustomAction f183k;

        /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction$a */
        class C0063a implements Parcelable.Creator<CustomAction> {
            C0063a() {
            }

            /* renamed from: a */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            /* renamed from: b */
            public CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f179g = str;
            this.f180h = charSequence;
            this.f181i = i;
            this.f182j = bundle;
        }

        /* renamed from: a */
        public static CustomAction m358a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            PlaybackState.CustomAction customAction = (PlaybackState.CustomAction) obj;
            Bundle extras = customAction.getExtras();
            MediaSessionCompat.m149b(extras);
            CustomAction customAction2 = new CustomAction(customAction.getAction(), customAction.getName(), customAction.getIcon(), extras);
            customAction2.f183k = customAction;
            return customAction2;
        }

        /* renamed from: b */
        public Object mo349b() {
            PlaybackState.CustomAction customAction = this.f183k;
            if (customAction != null || Build.VERSION.SDK_INT < 21) {
                return customAction;
            }
            PlaybackState.CustomAction.Builder builder = new PlaybackState.CustomAction.Builder(this.f179g, this.f180h, this.f181i);
            builder.setExtras(this.f182j);
            return builder.build();
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + this.f180h + ", mIcon=" + this.f181i + ", mExtras=" + this.f182j;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f179g);
            TextUtils.writeToParcel(this.f180h, parcel, i);
            parcel.writeInt(this.f181i);
            parcel.writeBundle(this.f182j);
        }

        CustomAction(Parcel parcel) {
            this.f179g = parcel.readString();
            this.f180h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f181i = parcel.readInt();
            this.f182j = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f167g = parcel.readInt();
        this.f168h = parcel.readLong();
        this.f170j = parcel.readFloat();
        this.f174n = parcel.readLong();
        this.f169i = parcel.readLong();
        this.f171k = parcel.readLong();
        this.f173m = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f175o = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f176p = parcel.readLong();
        this.f177q = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f172l = parcel.readInt();
    }
}
