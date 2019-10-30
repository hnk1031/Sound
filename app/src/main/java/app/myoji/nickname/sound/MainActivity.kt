package app.myoji.nickname.sound

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 読み込んだmp3のファイル名を指定して、アプリで利用できるようにしているよ
        val mediaPlayer = MediaPlayer.create(this, R.raw.taiko)

        // 画像がタップされたら、{ }（ブロック）内のコードが実行されるよ
        imageView.setOnClickListener {

            // 音楽スタート
            mediaPlayer.start()

        }

    }
}
