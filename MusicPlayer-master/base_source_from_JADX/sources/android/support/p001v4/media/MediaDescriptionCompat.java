package android.support.p001v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.MediaDescriptionCompat */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C0028a();

    /* renamed from: g */
    private final String f55g;

    /* renamed from: h */
    private final CharSequence f56h;

    /* renamed from: i */
    private final CharSequence f57i;

    /* renamed from: j */
    private final CharSequence f58j;

    /* renamed from: k */
    private final Bitmap f59k;

    /* renamed from: l */
    private final Uri f60l;

    /* renamed from: m */
    private final Bundle f61m;

    /* renamed from: n */
    private final Uri f62n;

    /* renamed from: o */
    private MediaDescription f63o;

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$a */
    class C0028a implements Parcelable.Creator<MediaDescriptionCompat> {
        C0028a() {
        }

        /* renamed from: a */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            if (Build.VERSION.SDK_INT < 21) {
                return new MediaDescriptionCompat(parcel);
            }
            return MediaDescriptionCompat.m77a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        /* renamed from: b */
        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$b */
    public static final class C0029b {

        /* renamed from: a */
        private String f64a;

        /* renamed from: b */
        private CharSequence f65b;

        /* renamed from: c */
        private CharSequence f66c;

        /* renamed from: d */
        private CharSequence f67d;

        /* renamed from: e */
        private Bitmap f68e;

        /* renamed from: f */
        private Uri f69f;

        /* renamed from: g */
        private Bundle f70g;

        /* renamed from: h */
        private Uri f71h;

        /* renamed from: a */
        public MediaDescriptionCompat mo79a() {
            return new MediaDescriptionCompat(this.f64a, this.f65b, this.f66c, this.f67d, this.f68e, this.f69f, this.f70g, this.f71h);
        }

        /* renamed from: b */
        public C0029b mo80b(CharSequence charSequence) {
            this.f67d = charSequence;
            return this;
        }

        /* renamed from: c */
        public C0029b mo81c(Bundle bundle) {
            this.f70g = bundle;
            return this;
        }

        /* renamed from: d */
        public C0029b mo82d(Bitmap bitmap) {
            this.f68e = bitmap;
            return this;
        }

        /* renamed from: e */
        public C0029b mo83e(Uri uri) {
            this.f69f = uri;
            return this;
        }

        /* renamed from: f */
        public C0029b mo84f(String str) {
            this.f64a = str;
            return this;
        }

        /* renamed from: g */
        public C0029b mo85g(Uri uri) {
            this.f71h = uri;
            return this;
        }

        /* renamed from: h */
        public C0029b mo86h(CharSequence charSequence) {
            this.f66c = charSequence;
            return this;
        }

        /* renamed from: i */
        public C0029b mo87i(CharSequence charSequence) {
            this.f65b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f55g = str;
        this.f56h = charSequence;
        this.f57i = charSequence2;
        this.f58j = charSequence3;
        this.f59k = bitmap;
        this.f60l = uri;
        this.f61m = bundle;
        this.f62n = uri2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0072  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.p001v4.media.MediaDescriptionCompat m77a(java.lang.Object r9) {
        /*
            r0 = 0
            if (r9 == 0) goto L_0x0083
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto L_0x0083
            android.support.v4.media.MediaDescriptionCompat$b r2 = new android.support.v4.media.MediaDescriptionCompat$b
            r2.<init>()
            android.media.MediaDescription r9 = (android.media.MediaDescription) r9
            java.lang.String r3 = r9.getMediaId()
            r2.mo84f(r3)
            java.lang.CharSequence r3 = r9.getTitle()
            r2.mo87i(r3)
            java.lang.CharSequence r3 = r9.getSubtitle()
            r2.mo86h(r3)
            java.lang.CharSequence r3 = r9.getDescription()
            r2.mo80b(r3)
            android.graphics.Bitmap r3 = r9.getIconBitmap()
            r2.mo82d(r3)
            android.net.Uri r3 = r9.getIconUri()
            r2.mo83e(r3)
            android.os.Bundle r3 = r9.getExtras()
            if (r3 == 0) goto L_0x0044
            android.os.Bundle r3 = android.support.p001v4.media.session.MediaSessionCompat.m151n(r3)
        L_0x0044:
            java.lang.String r4 = "android.support.v4.media.description.MEDIA_URI"
            if (r3 == 0) goto L_0x004f
            android.os.Parcelable r5 = r3.getParcelable(r4)
            android.net.Uri r5 = (android.net.Uri) r5
            goto L_0x0050
        L_0x004f:
            r5 = r0
        L_0x0050:
            if (r5 == 0) goto L_0x0068
            java.lang.String r6 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r7 = r3.containsKey(r6)
            if (r7 == 0) goto L_0x0062
            int r7 = r3.size()
            r8 = 2
            if (r7 != r8) goto L_0x0062
            goto L_0x0069
        L_0x0062:
            r3.remove(r4)
            r3.remove(r6)
        L_0x0068:
            r0 = r3
        L_0x0069:
            r2.mo81c(r0)
            if (r5 == 0) goto L_0x0072
            r2.mo85g(r5)
            goto L_0x007d
        L_0x0072:
            r0 = 23
            if (r1 < r0) goto L_0x007d
            android.net.Uri r0 = r9.getMediaUri()
            r2.mo85g(r0)
        L_0x007d:
            android.support.v4.media.MediaDescriptionCompat r0 = r2.mo79a()
            r0.f63o = r9
        L_0x0083:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p001v4.media.MediaDescriptionCompat.m77a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    /* renamed from: b */
    public Object mo70b() {
        int i;
        MediaDescription mediaDescription = this.f63o;
        if (mediaDescription != null || (i = Build.VERSION.SDK_INT) < 21) {
            return mediaDescription;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.f55g);
        builder.setTitle(this.f56h);
        builder.setSubtitle(this.f57i);
        builder.setDescription(this.f58j);
        builder.setIconBitmap(this.f59k);
        builder.setIconUri(this.f60l);
        Bundle bundle = this.f61m;
        if (i < 23 && this.f62n != null) {
            if (bundle == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f62n);
        }
        builder.setExtras(bundle);
        if (i >= 23) {
            builder.setMediaUri(this.f62n);
        }
        MediaDescription build = builder.build();
        this.f63o = build;
        return build;
    }

    /* renamed from: d */
    public String mo71d() {
        return this.f55g;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f56h + ", " + this.f57i + ", " + this.f58j;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (Build.VERSION.SDK_INT < 21) {
            parcel.writeString(this.f55g);
            TextUtils.writeToParcel(this.f56h, parcel, i);
            TextUtils.writeToParcel(this.f57i, parcel, i);
            TextUtils.writeToParcel(this.f58j, parcel, i);
            parcel.writeParcelable(this.f59k, i);
            parcel.writeParcelable(this.f60l, i);
            parcel.writeBundle(this.f61m);
            parcel.writeParcelable(this.f62n, i);
            return;
        }
        ((MediaDescription) mo70b()).writeToParcel(parcel, i);
    }

    MediaDescriptionCompat(Parcel parcel) {
        this.f55g = parcel.readString();
        this.f56h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f57i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f58j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.f59k = (Bitmap) parcel.readParcelable(classLoader);
        this.f60l = (Uri) parcel.readParcelable(classLoader);
        this.f61m = parcel.readBundle(classLoader);
        this.f62n = (Uri) parcel.readParcelable(classLoader);
    }
}
