package coocent.music.player.adapter;

import android.widget.RatingBar;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import coocent.musiclibrary.music.model.Song;
import media.musicplayer.audioplayer.videoplayer.R;
import p342g.p343a.p344a.p358i.C8314f;
import p342g.p343a.p344a.p358i.C8345u;

public class TopRateAdapter extends BaseQuickAdapter<Song, BaseViewHolder> {
    /* renamed from: d */
    private void m39976d(BaseViewHolder baseViewHolder, Song song) {
        RatingBar ratingBar = (RatingBar) baseViewHolder.getView(R.id.ratingbar);
        if (ratingBar != null) {
            ratingBar.setNumStars(song.mo28239a());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void convert(BaseViewHolder baseViewHolder, Song song) {
        baseViewHolder.setText((int) R.id.song_title, (CharSequence) song.f32560m);
        baseViewHolder.setText((int) R.id.song_artist, (CharSequence) song.f32557j);
        baseViewHolder.setText((int) R.id.song_time, (CharSequence) C8345u.m46337r((long) (song.f32558k / 1000)));
        C8314f.m45973b(this.mContext, 8, song.f32559l, song.f32554g);
        baseViewHolder.addOnClickListener(R.id.popup_menu);
        m39976d(baseViewHolder, song);
    }
}
