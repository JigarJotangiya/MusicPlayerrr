package coocent.music.player.adapter;

import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.chad.library.adapter.base.BaseItemDraggableAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.coocent.music.base.data.entity.Music;
import com.makeramen.roundedimageview.RoundedImageView;
import coocent.music.player.widget.EqualizerView;
import coocent.music.player.widget.p275k.C7238p0;
import java.util.List;
import media.musicplayer.audioplayer.videoplayer.R;
import net.coocent.android.xmlparser.p461z.C9566f;
import p342g.p343a.p344a.p355g.C8287e;
import p342g.p343a.p344a.p358i.C8314f;
import p342g.p343a.p344a.p358i.C8321j;
import p342g.p343a.p344a.p358i.C8337n;
import p342g.p343a.p344a.p358i.C8343s;
import p342g.p343a.p344a.p358i.C8345u;

public class NowPlayListAdapter extends BaseItemDraggableAdapter<Music, BaseViewHolder> {

    /* renamed from: a */
    private final int f31099a;

    public NowPlayListAdapter(int i, List<Music> list, int i2) {
        super(i, list);
        new C8337n(C8345u.m46327h());
        this.f31099a = i2;
    }

    /* renamed from: e */
    private void m39955e(BaseViewHolder baseViewHolder, Music music, TextView textView, EqualizerView equalizerView, ImageView imageView, TextView textView2) {
        BaseViewHolder baseViewHolder2 = baseViewHolder;
        TextView textView3 = textView;
        EqualizerView equalizerView2 = equalizerView;
        ImageView imageView2 = imageView;
        TextView textView4 = textView2;
        if (C8287e.m45873v() == null || C8287e.m45873v().mo9215k() != music.mo9215k()) {
            equalizerView2.setVisibility(8);
            textView3.setVisibility(0);
            imageView2.setVisibility(4);
            textView4.setVisibility(0);
            int i = this.f31099a;
            baseViewHolder2.setTextColor(R.id.song_title, C8343s.m46295c((i == C7238p0.f31964G || i == C7238p0.f31963F) ? R.color.white : R.color.default_text_color));
            baseViewHolder2.setTextColor(R.id.song_artist, C8343s.m46295c(R.color.now_playlist_sub_txt_color));
            return;
        }
        imageView2.setVisibility(0);
        textView4.setVisibility(4);
        C8321j.m46008n(C8314f.m45973b(this.mContext, 0, music.mo9215k(), music.mo9205d()), C8343s.m46298f(R.drawable.ic_library_icon05_tracks_song_smal), imageView, C8345u.m46323d(50), C8345u.m46323d(50), false, false);
        equalizerView2.setVisibility(0);
        textView3.setVisibility(4);
        baseViewHolder2.setTextColor(R.id.song_title, C8343s.m46300h());
        baseViewHolder2.setTextColor(R.id.song_artist, C8343s.m46300h());
        int d = mo26896d();
        if (d >= 0 && d == baseViewHolder.getAdapterPosition()) {
            try {
                if (C8287e.m45812V()) {
                    equalizerView.mo27498a();
                } else {
                    equalizerView.mo27499d();
                }
            } catch (Exception unused) {
                equalizerView2.setVisibility(8);
                textView3.setVisibility(0);
                imageView2.setVisibility(4);
                textView4.setVisibility(0);
            }
        } else if (d != -1) {
            equalizerView2.setVisibility(8);
            textView3.setVisibility(0);
            imageView2.setVisibility(4);
            textView4.setVisibility(0);
            int i2 = this.f31099a;
            baseViewHolder2.setTextColor(R.id.song_title, C8343s.m46295c((i2 == C7238p0.f31964G || i2 == C7238p0.f31963F) ? R.color.white : R.color.default_text_color));
            baseViewHolder2.setTextColor(R.id.song_artist, C8343s.m46295c(R.color.now_playlist_sub_txt_color));
        } else if (C8287e.m45812V()) {
            equalizerView.mo27498a();
        } else {
            equalizerView.mo27499d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void convert(BaseViewHolder baseViewHolder, Music music) {
        baseViewHolder.setText((int) R.id.song_title, (CharSequence) music.mo9218n());
        baseViewHolder.setText((int) R.id.song_artist, (CharSequence) music.mo9210g());
        boolean z = false;
        if (music.mo9261a() == 7 || music.mo9210g().trim().isEmpty()) {
            baseViewHolder.setGone(R.id.song_artist, false);
        } else {
            baseViewHolder.setGone(R.id.song_artist, true);
        }
        TextView textView = (TextView) baseViewHolder.getView(R.id.timeTxt);
        TextView textView2 = (TextView) baseViewHolder.getView(R.id.tv_indexText);
        ImageView imageView = (ImageView) baseViewHolder.getView(R.id.moreBtn);
        int i = this.f31099a;
        int i2 = C7238p0.f31964G;
        int i3 = R.color.default_text_color;
        baseViewHolder.setTextColor(R.id.song_title, C8343s.m46295c((i == i2 || i == C7238p0.f31963F) ? R.color.white : R.color.default_text_color));
        baseViewHolder.setTextColor(R.id.song_artist, C8343s.m46295c(R.color.now_playlist_sub_txt_color));
        baseViewHolder.setTextColor(R.id.timeTxt, C8343s.m46295c(R.color.now_playlist_sub_txt_color));
        int i4 = this.f31099a;
        if (i4 == C7238p0.f31964G || i4 == C7238p0.f31963F) {
            i3 = R.color.white;
        }
        textView2.setTextColor(C8343s.m46295c(i3));
        ((ImageView) baseViewHolder.getView(R.id.drag)).setImageDrawable(C8343s.m46304l(R.drawable.eject_playlist_button01_on, R.color.now_playlist_sub_txt_color));
        imageView.setImageDrawable(C8343s.m46304l(R.drawable.list_ic_del, R.color.now_playlist_sub_txt_color));
        textView.setText(C8345u.m46337r((long) (music.mo9214j() / 1000)));
        RoundedImageView roundedImageView = (RoundedImageView) baseViewHolder.getView(R.id.albumArt);
        roundedImageView.setBackground(C8343s.m46298f(R.drawable.ic_library_icon05_tracks_song_smal_bg_now));
        roundedImageView.setOval(true);
        textView2.setText(String.valueOf(baseViewHolder.getAdapterPosition() + 1));
        m39955e(baseViewHolder, music, textView, (EqualizerView) baseViewHolder.getView(R.id.song_equalizerView), roundedImageView, textView2);
        if (this.f31099a != C7238p0.f31963F) {
            z = true;
        }
        baseViewHolder.setGone(R.id.moreBtn, z);
        if (this.f31099a == C7238p0.f31963F) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) roundedImageView.getLayoutParams();
            layoutParams.setMarginStart(C9566f.m50190a(this.mContext, 10));
            roundedImageView.setLayoutParams(layoutParams);
        }
        baseViewHolder.addOnClickListener(R.id.moreBtn);
    }

    /* renamed from: d */
    public int mo26896d() {
        try {
            int i = 0;
            if (C8287e.m45792L() != 5) {
                if (C8287e.m45867s() == null || C8287e.m45867s().size() <= 0) {
                    return -1;
                }
                List<Music> s = C8287e.m45867s();
                while (i < s.size()) {
                    if (C8287e.m45873v().mo9215k() != s.get(i).mo9215k() || i != C8287e.m45863q()) {
                        i++;
                    }
                }
                return -1;
            } else if (C8287e.m45869t() == null || C8287e.m45867s() == null || C8287e.m45867s().size() <= 0) {
                return -1;
            } else {
                List<Music> s2 = C8287e.m45867s();
                while (i < s2.size()) {
                    if (C8287e.m45873v().mo9215k() != s2.get(i).mo9215k() || i != C8287e.m45863q()) {
                        i++;
                    }
                }
                return -1;
            }
            return i;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}
