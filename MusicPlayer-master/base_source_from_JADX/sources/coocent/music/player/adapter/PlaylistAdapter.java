package coocent.music.player.adapter;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.coocent.music.base.data.entity.Playlist;
import com.coocent.music.base.p056ui.view.SignKeyWordTextView;
import com.makeramen.roundedimageview.RoundedImageView;
import coocent.music.player.base.BaseApplication;
import java.util.List;
import media.musicplayer.audioplayer.videoplayer.R;
import p342g.p343a.p344a.p358i.C8321j;
import p342g.p343a.p344a.p358i.C8343s;
import p342g.p343a.p344a.p358i.C8345u;
import p443m.p444a.p447e.p448a.C9332d;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

public class PlaylistAdapter extends BaseQuickAdapter<Playlist, BaseViewHolder> {

    /* renamed from: a */
    private int f31100a = 0;

    /* renamed from: b */
    private int f31101b = 0;

    public PlaylistAdapter(int i, List<Playlist> list, boolean z, int i2, int i3) {
        super(i, list);
        C8345u.m46333n(R.string.favorites);
        this.f31100a = i2;
        this.f31101b = i3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void convert(BaseViewHolder baseViewHolder, Playlist playlist) {
        BaseViewHolder baseViewHolder2 = baseViewHolder;
        if (playlist != null) {
            try {
                SignKeyWordTextView signKeyWordTextView = (SignKeyWordTextView) baseViewHolder2.getView(R.id.song_title);
                SignKeyWordTextView signKeyWordTextView2 = (SignKeyWordTextView) baseViewHolder2.getView(R.id.song_artist);
                int i = this.f31101b;
                if (i == 2 || i == 4) {
                    signKeyWordTextView.setSignText(BaseApplication.f31146j);
                    signKeyWordTextView2.setSignText(BaseApplication.f31146j);
                    signKeyWordTextView.setSignTextColor(C8343s.m46300h());
                    signKeyWordTextView2.setSignTextColor(C8343s.m46300h());
                }
                baseViewHolder2.setText((int) R.id.song_title, (CharSequence) playlist.mo9242g());
                mo26900d((ImageView) baseViewHolder2.getView(R.id.iv_playlist_item));
                baseViewHolder2.setImageDrawable(R.id.popup_menu, C8343s.m46304l(R.drawable.ic_home04_more, R.color.menu_tint_color));
                baseViewHolder2.setTextColor(R.id.song_title, C9332d.m49405b(this.mContext, R.color.default_text_color));
                baseViewHolder2.setTextColor(R.id.song_artist, C8343s.m46295c(R.color.app_sub_title_color));
                RoundedImageView roundedImageView = (RoundedImageView) baseViewHolder2.getView(R.id.albumArt);
                roundedImageView.setBackground(C8343s.m46298f(R.drawable.ic_library_icon05_tracks_song_smal_bg));
                roundedImageView.setOval(false);
                roundedImageView.setCornerRadius((float) C8345u.m46323d(5));
                String i2 = playlist.mo9245i();
                Drawable l = C8343s.m46304l(R.drawable.ic_home_ic_lists, R.color.icon_tint_color);
                int i3 = 100;
                int d = C8345u.m46323d(this.f31100a == 0 ? 100 : 50);
                if (this.f31100a != 0) {
                    i3 = 50;
                }
                C8321j.m46008n(i2, l, roundedImageView, d, C8345u.m46323d(i3), false, false);
                if (this.mContext != null) {
                    if (playlist.mo9243h() > 1) {
                        baseViewHolder2.setText((int) R.id.song_artist, (CharSequence) BuildConfig.FLAVOR + playlist.mo9243h() + " " + this.mContext.getString(R.string.counttracks));
                    } else {
                        baseViewHolder2.setText((int) R.id.song_artist, (CharSequence) BuildConfig.FLAVOR + playlist.mo9243h() + " " + this.mContext.getString(R.string.counttrack));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        baseViewHolder2.addOnClickListener(R.id.popup_menu);
        if (this.f31101b == 3) {
            baseViewHolder2.setVisible(R.id.iv_playlist_item, true);
            baseViewHolder2.setVisible(R.id.popup_menu, false);
            return;
        }
        baseViewHolder2.setVisible(R.id.iv_playlist_item, false);
        baseViewHolder2.setVisible(R.id.popup_menu, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo26900d(ImageView imageView) {
        if (!C8345u.m46336q()) {
            if (imageView != null) {
                imageView.setImageDrawable(C8343s.m46304l(R.drawable.ic_next1, R.color.default_text_color));
            }
        } else if (imageView != null) {
            imageView.setImageDrawable(C8343s.m46304l(R.drawable.ic_next1_rtl, R.color.default_text_color));
        }
    }
}
