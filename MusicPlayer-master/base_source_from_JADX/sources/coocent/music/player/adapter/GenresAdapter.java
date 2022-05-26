package coocent.music.player.adapter;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.coocent.music.base.data.entity.Genres;
import java.util.List;
import media.musicplayer.audioplayer.videoplayer.R;
import p342g.p343a.p344a.p358i.C8321j;
import p342g.p343a.p344a.p358i.C8345u;
import p443m.p444a.p447e.p448a.C9332d;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

public class GenresAdapter extends BaseQuickAdapter<Genres, BaseViewHolder> {

    /* renamed from: a */
    private int f31095a;

    public GenresAdapter(int i, List<Genres> list, int i2) {
        super(i, list);
        this.f31095a = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void convert(BaseViewHolder baseViewHolder, Genres genres) {
        if (genres.f8207i == null) {
            genres.f8207i = "<unknown>";
        }
        baseViewHolder.setText((int) R.id.song_title, (CharSequence) genres.f8207i);
        baseViewHolder.getView(R.id.song_artist).setVisibility(8);
        Drawable d = C9332d.m49407d(this.mContext, this.f31095a == 0 ? R.drawable.library_icon09_genres : R.drawable.library_icon09_genres_small);
        ImageView imageView = (ImageView) baseViewHolder.getView(R.id.albumArt);
        int i = 100;
        int d2 = C8345u.m46323d(this.f31095a == 0 ? 100 : 50);
        if (this.f31095a != 0) {
            i = 50;
        }
        C8321j.m46008n(BuildConfig.FLAVOR, d, imageView, d2, C8345u.m46323d(i), false, false);
        if (genres.mo9188e() > 1) {
            baseViewHolder.setText((int) R.id.song_time, (CharSequence) genres.mo9188e() + " " + this.mContext.getResources().getString(R.string.counttracks));
        } else {
            baseViewHolder.setText((int) R.id.song_time, (CharSequence) genres.mo9188e() + " " + this.mContext.getResources().getString(R.string.counttrack));
        }
        baseViewHolder.addOnClickListener(R.id.popup_menu);
    }
}
