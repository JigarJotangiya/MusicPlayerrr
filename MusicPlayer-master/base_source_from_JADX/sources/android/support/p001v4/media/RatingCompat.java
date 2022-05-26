package android.support.p001v4.media;

import android.annotation.SuppressLint;
import android.media.Rating;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.RatingCompat */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new C0032a();

    /* renamed from: g */
    private final int f76g;

    /* renamed from: h */
    private final float f77h;

    /* renamed from: i */
    private Object f78i;

    /* renamed from: android.support.v4.media.RatingCompat$a */
    class C0032a implements Parcelable.Creator<RatingCompat> {
        C0032a() {
        }

        /* renamed from: a */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        /* renamed from: b */
        public RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }
    }

    RatingCompat(int i, float f) {
        this.f76g = i;
        this.f77h = f;
    }

    /* renamed from: a */
    public static RatingCompat m105a(Object obj) {
        RatingCompat ratingCompat = null;
        if (obj != null && Build.VERSION.SDK_INT >= 19) {
            Rating rating = (Rating) obj;
            int ratingStyle = rating.getRatingStyle();
            if (rating.isRated()) {
                switch (ratingStyle) {
                    case 1:
                        ratingCompat = m106b(rating.hasHeart());
                        break;
                    case 2:
                        ratingCompat = m109f(rating.isThumbUp());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        ratingCompat = m108e(ratingStyle, rating.getStarRating());
                        break;
                    case 6:
                        ratingCompat = m107d(rating.getPercentRating());
                        break;
                    default:
                        return null;
                }
            } else {
                ratingCompat = m110g(ratingStyle);
            }
            ratingCompat.f78i = obj;
        }
        return ratingCompat;
    }

    /* renamed from: b */
    public static RatingCompat m106b(boolean z) {
        return new RatingCompat(1, z ? 1.0f : 0.0f);
    }

    /* renamed from: d */
    public static RatingCompat m107d(float f) {
        if (f >= 0.0f && f <= 100.0f) {
            return new RatingCompat(6, f);
        }
        Log.e("Rating", "Invalid percentage-based rating value");
        return null;
    }

    /* renamed from: e */
    public static RatingCompat m108e(int i, float f) {
        float f2;
        if (i == 3) {
            f2 = 3.0f;
        } else if (i == 4) {
            f2 = 4.0f;
        } else if (i != 5) {
            Log.e("Rating", "Invalid rating style (" + i + ") for a star rating");
            return null;
        } else {
            f2 = 5.0f;
        }
        if (f >= 0.0f && f <= f2) {
            return new RatingCompat(i, f);
        }
        Log.e("Rating", "Trying to set out of range star-based rating");
        return null;
    }

    /* renamed from: f */
    public static RatingCompat m109f(boolean z) {
        return new RatingCompat(2, z ? 1.0f : 0.0f);
    }

    /* renamed from: g */
    public static RatingCompat m110g(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new RatingCompat(i, -1.0f);
            default:
                return null;
        }
    }

    public int describeContents() {
        return this.f76g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.f76g);
        sb.append(" rating=");
        float f = this.f77h;
        sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f76g);
        parcel.writeFloat(this.f77h);
    }
}
