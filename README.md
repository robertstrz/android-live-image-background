# LiveImageBackground
Move your background/imageview in compliance with data obtained from gyroscope

[![Build Status](https://travis-ci.org/Rzodkiewka/LiveImageBackground.svg?branch=master)](https://travis-ci.org/Rzodkiewka/LiveImageBackground)
# Presentation
![](docs/app-presentation.gif)
## Usage

```java
public class MainActivity extends AppCompatActivity {

    LiveBackgroundImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onContentChanged() {
        super.onContentChanged();
        imageView = (LiveBackgroundImageView) findViewById(R.id.image);
    }

    @Override
    protected void onDestroy() {
        imageView.stopGyroscope();
        super.onDestroy();
    }
}
```
### Additional libraries
Full library code that has been used to scroll ImageView to given position can be found here
https://github.com/MikeOrtiz/TouchImageView

### License
Copyright (c) 2016 Robert Strzępka

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE
