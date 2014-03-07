//Reads a jpgs image
#include "commonHeaders.h"

int main(int argc, char * argv[]){
	Mat image;
	image = imread("../dogSamples/german-shepherd-dog.jpg", CV_LOAD_IMAGE_COLOR);
	if(!image.data){
		cout << "Could not open or find image" << endl;
		return -1;
	}
	//CV_WINDOW_AUTOSIZE takes the size of the image. No resize
	//CV_WINDOW_NORMAL|CV_WINDOW_KEEPRATIOCV_WINDOW_NORMAL Resize to windows size. 
	namedWindow("Display window", CV_WINDOW_AUTOSIZE);
	imshow("Display window", image);
	waitKey(0);
	return 0;
}
