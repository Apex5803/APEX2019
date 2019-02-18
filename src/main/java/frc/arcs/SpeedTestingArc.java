package frc.arcs;

import com.team319.follower.SrxMotionProfile;
import com.team319.follower.SrxTrajectory;

public class SpeedTestingArc extends SrxTrajectory {
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (2.00,13.50,0.00)
	// (5.00,16.50,89.99)
	// (8.00,19.50,179.98)
	
    public SpeedTestingArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public SpeedTestingArc(boolean flipped) {
		super();
		this.highGear = true;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = true;

	double[][] centerPoints = {
				{0.000,0.000,10.000,0.000},
				{2.086,20.861,10.000,0.000},
				{6.258,41.722,10.000,0.000},
				{12.516,62.582,10.000,0.000},
				{20.861,83.443,10.000,0.000},
				{31.291,104.304,10.000,0.000},
				{43.808,125.165,10.000,0.000},
				{58.410,146.025,10.000,0.000},
				{75.099,166.886,10.000,0.000},
				{93.873,187.747,10.000,-0.010},
				{114.734,208.608,10.000,-0.010},
				{137.681,229.468,10.000,-0.010},
				{162.714,250.329,10.000,-0.020},
				{189.833,271.190,10.000,-0.030},
				{219.038,292.051,10.000,-0.030},
				{250.329,312.911,10.000,-0.040},
				{283.706,333.772,10.000,-0.060},
				{319.170,354.633,10.000,-0.070},
				{356.719,375.494,10.000,-0.090},
				{396.354,396.354,10.000,-0.110},
				{438.076,417.215,10.000,-0.130},
				{481.883,438.076,10.000,-0.160},
				{527.777,458.937,10.000,-0.190},
				{575.757,479.797,10.000,-0.230},
				{625.823,500.658,10.000,-0.270},
				{677.975,521.519,10.000,-0.320},
				{732.213,542.380,10.000,-0.370},
				{788.537,563.240,10.000,-0.430},
				{846.947,584.101,10.000,-0.490},
				{907.443,604.962,10.000,-0.570},
				{970.025,625.823,10.000,-0.650},
				{1034.694,646.683,10.000,-0.730},
				{1101.448,667.544,10.000,-0.830},
				{1170.288,688.405,10.000,-0.940},
				{1241.215,709.266,10.000,-1.060},
				{1314.228,730.126,10.000,-1.180},
				{1389.326,750.987,10.000,-1.320},
				{1466.511,771.848,10.000,-1.480},
				{1544.739,782.278,10.000,-1.640},
				{1622.967,782.278,10.000,-1.810},
				{1701.195,782.278,10.000,-1.990},
				{1779.423,782.278,10.000,-2.180},
				{1857.650,782.278,10.000,-2.390},
				{1935.878,782.278,10.000,-2.600},
				{2014.106,782.278,10.000,-2.820},
				{2092.334,782.278,10.000,-3.050},
				{2170.562,782.278,10.000,-3.290},
				{2248.790,782.278,10.000,-3.540},
				{2327.017,782.278,10.000,-3.800},
				{2405.245,782.278,10.000,-4.070},
				{2483.473,782.278,10.000,-4.350},
				{2561.701,782.278,10.000,-4.650},
				{2639.929,782.278,10.000,-4.960},
				{2718.157,782.278,10.000,-5.270},
				{2796.384,782.278,10.000,-5.610},
				{2874.612,782.278,10.000,-5.950},
				{2952.840,782.278,10.000,-6.310},
				{3031.068,782.278,10.000,-6.680},
				{3109.296,782.278,10.000,-7.060},
				{3187.524,782.278,10.000,-7.460},
				{3265.751,782.278,10.000,-7.870},
				{3343.979,782.278,10.000,-8.300},
				{3422.207,782.278,10.000,-8.740},
				{3500.435,782.278,10.000,-9.200},
				{3578.663,782.278,10.000,-9.670},
				{3656.891,782.278,10.000,-10.160},
				{3735.118,782.278,10.000,-10.670},
				{3813.346,782.278,10.000,-11.190},
				{3891.574,782.278,10.000,-11.740},
				{3969.802,782.278,10.000,-12.300},
				{4048.030,782.278,10.000,-12.880},
				{4126.258,782.278,10.000,-13.480},
				{4204.486,782.278,10.000,-14.100},
				{4282.713,782.278,10.000,-14.740},
				{4360.941,782.278,10.000,-15.400},
				{4439.169,782.278,10.000,-16.080},
				{4517.397,782.278,10.000,-16.780},
				{4595.625,782.278,10.000,-17.510},
				{4673.853,782.278,10.000,-18.260},
				{4752.080,782.278,10.000,-19.030},
				{4830.308,782.278,10.000,-19.820},
				{4908.536,782.278,10.000,-20.640},
				{4986.764,782.278,10.000,-21.480},
				{5064.992,782.278,10.000,-22.340},
				{5143.220,782.278,10.000,-23.230},
				{5221.447,782.278,10.000,-24.150},
				{5299.675,782.278,10.000,-25.080},
				{5377.903,782.278,10.000,-26.040},
				{5456.131,782.278,10.000,-27.030},
				{5534.359,782.278,10.000,-28.040},
				{5612.587,782.278,10.000,-29.060},
				{5690.814,782.278,10.000,-30.120},
				{5769.042,782.278,10.000,-31.190},
				{5847.270,782.278,10.000,-32.280},
				{5925.498,782.278,10.000,-33.390},
				{6003.726,782.278,10.000,-34.520},
				{6081.954,782.278,10.000,-35.670},
				{6160.181,782.278,10.000,-36.830},
				{6238.409,782.278,10.000,-38.000},
				{6316.637,782.278,10.000,-39.190},
				{6394.865,782.278,10.000,-40.380},
				{6473.093,782.278,10.000,-41.590},
				{6551.321,782.278,10.000,-42.800},
				{6629.548,782.278,10.000,-44.010},
				{6707.776,782.278,10.000,-45.220},
				{6786.004,782.278,10.000,-46.440},
				{6864.232,782.278,10.000,-47.650},
				{6942.460,782.278,10.000,-48.860},
				{7020.688,782.278,10.000,-50.060},
				{7098.916,782.278,10.000,-51.250},
				{7177.143,782.278,10.000,-52.430},
				{7255.371,782.278,10.000,-53.600},
				{7333.599,782.278,10.000,-54.760},
				{7411.827,782.278,10.000,-55.900},
				{7490.055,782.278,10.000,-57.020},
				{7568.283,782.278,10.000,-58.120},
				{7646.510,782.278,10.000,-59.210},
				{7724.738,782.278,10.000,-60.270},
				{7802.966,782.278,10.000,-61.320},
				{7881.194,782.278,10.000,-62.340},
				{7959.422,782.278,10.000,-63.340},
				{8037.650,782.278,10.000,-64.310},
				{8115.877,782.278,10.000,-65.260},
				{8194.105,782.278,10.000,-66.190},
				{8272.333,782.278,10.000,-67.090},
				{8350.561,782.278,10.000,-67.970},
				{8428.789,782.278,10.000,-68.830},
				{8507.017,782.278,10.000,-69.660},
				{8585.244,782.278,10.000,-70.470},
				{8663.472,782.278,10.000,-71.260},
				{8741.700,782.278,10.000,-72.020},
				{8819.928,782.278,10.000,-72.760},
				{8898.156,782.278,10.000,-73.470},
				{8976.384,782.278,10.000,-74.170},
				{9054.611,782.278,10.000,-74.840},
				{9132.839,782.278,10.000,-75.500},
				{9211.067,782.278,10.000,-76.130},
				{9289.295,782.278,10.000,-76.740},
				{9367.523,782.278,10.000,-77.330},
				{9445.751,782.278,10.000,-77.900},
				{9523.978,782.278,10.000,-78.460},
				{9602.206,782.278,10.000,-79.000},
				{9680.434,782.278,10.000,-79.510},
				{9758.662,782.278,10.000,-80.010},
				{9836.890,782.278,10.000,-80.500},
				{9915.118,782.278,10.000,-80.970},
				{9993.345,782.278,10.000,-81.420},
				{10071.573,782.278,10.000,-81.850},
				{10149.801,782.278,10.000,-82.280},
				{10228.029,782.278,10.000,-82.680},
				{10306.257,782.278,10.000,-83.070},
				{10384.485,782.278,10.000,-83.450},
				{10462.713,782.278,10.000,-83.820},
				{10540.940,782.278,10.000,-84.170},
				{10619.168,782.278,10.000,-84.510},
				{10697.396,782.278,10.000,-84.840},
				{10775.624,782.278,10.000,-85.150},
				{10853.852,782.278,10.000,-85.450},
				{10932.080,782.278,10.000,-85.740},
				{11010.307,782.278,10.000,-86.020},
				{11088.535,782.278,10.000,-86.290},
				{11166.763,782.278,10.000,-86.550},
				{11244.991,782.278,10.000,-86.790},
				{11323.219,782.278,10.000,-87.030},
				{11401.447,782.278,10.000,-87.260},
				{11479.674,782.278,10.000,-87.470},
				{11557.902,782.278,10.000,-87.680},
				{11636.130,782.278,10.000,-87.880},
				{11714.358,782.278,10.000,-88.060},
				{11792.586,782.278,10.000,-88.240},
				{11870.814,782.278,10.000,-88.410},
				{11949.041,782.278,10.000,-88.570},
				{12027.269,782.278,10.000,-88.720},
				{12105.497,782.278,10.000,-88.860},
				{12183.725,782.278,10.000,-89.000},
				{12259.867,761.418,10.000,-89.120},
				{12333.922,740.557,10.000,-89.230},
				{12405.892,719.696,10.000,-89.330},
				{12475.776,698.835,10.000,-89.420},
				{12543.573,677.975,10.000,-89.500},
				{12609.284,657.114,10.000,-89.570},
				{12672.910,636.253,10.000,-89.640},
				{12734.449,615.392,10.000,-89.700},
				{12793.902,594.532,10.000,-89.750},
				{12851.269,573.671,10.000,-89.790},
				{12906.550,552.810,10.000,-89.830},
				{12959.745,531.949,10.000,-89.860},
				{13010.854,511.089,10.000,-89.890},
				{13059.877,490.228,10.000,-89.920},
				{13106.813,469.367,10.000,-89.940},
				{13151.664,448.506,10.000,-89.950},
				{13194.429,427.646,10.000,-89.960},
				{13235.107,406.785,10.000,-89.970},
				{13273.699,385.924,10.000,-89.980},
				{13310.206,365.063,10.000,-89.990},
				{13344.626,344.202,10.000,-89.990},
				{13376.960,323.342,10.000,-89.990},
				{13407.208,302.481,10.000,-89.990},
				{13407.208,302.481,10.000,-89.990},
				{13433.284,260.759,10.000,-89.990},
				{13459.360,260.759,10.000,-89.990},
				{13485.436,260.759,10.000,-89.980},
				{13511.512,260.759,10.000,-89.980},
				{13537.588,260.759,10.000,-89.970},
				{13563.664,260.759,10.000,-89.970},
				{13589.740,260.759,10.000,-89.960},
				{13615.816,260.759,10.000,-89.950},
				{13641.892,260.759,10.000,-89.950},
				{13667.968,260.759,10.000,-89.940},
				{13694.044,260.759,10.000,-89.920},
				{13720.120,260.759,10.000,-89.910},
				{13746.196,260.759,10.000,-89.900},
				{13772.272,260.759,10.000,-89.890},
				{13798.348,260.759,10.000,-89.870},
				{13824.423,260.759,10.000,-89.860},
				{13850.499,260.759,10.000,-89.840},
				{13876.575,260.759,10.000,-89.830},
				{13902.651,260.759,10.000,-89.810},
				{13928.727,260.759,10.000,-89.790},
				{13954.803,260.759,10.000,-89.770},
				{13980.879,260.759,10.000,-89.750},
				{14006.955,260.759,10.000,-89.730},
				{14033.031,260.759,10.000,-89.700},
				{14059.107,260.759,10.000,-89.680},
				{14085.183,260.759,10.000,-89.660},
				{14111.259,260.759,10.000,-89.630},
				{14137.335,260.759,10.000,-89.600},
				{14163.411,260.759,10.000,-89.580},
				{14189.487,260.759,10.000,-89.550},
				{14215.563,260.759,10.000,-89.520},
				{14241.639,260.759,10.000,-89.490},
				{14267.715,260.759,10.000,-89.460},
				{14293.790,260.759,10.000,-89.430},
				{14319.866,260.759,10.000,-89.390},
				{14345.942,260.759,10.000,-89.360},
				{14372.018,260.759,10.000,-89.330},
				{14398.094,260.759,10.000,-89.290},
				{14424.170,260.759,10.000,-89.250},
				{14450.246,260.759,10.000,-89.220},
				{14476.322,260.759,10.000,-89.180},
				{14502.398,260.759,10.000,-89.140},
				{14528.474,260.759,10.000,-89.100},
				{14554.550,260.759,10.000,-89.060},
				{14580.626,260.759,10.000,-89.020},
				{14606.702,260.759,10.000,-88.970},
				{14632.778,260.759,10.000,-88.930},
				{14658.854,260.759,10.000,-88.880},
				{14684.930,260.759,10.000,-88.840},
				{14711.006,260.759,10.000,-88.790},
				{14737.082,260.759,10.000,-88.740},
				{14763.158,260.759,10.000,-88.690},
				{14789.233,260.759,10.000,-88.640},
				{14815.309,260.759,10.000,-88.590},
				{14841.385,260.759,10.000,-88.540},
				{14867.461,260.759,10.000,-88.490},
				{14893.537,260.759,10.000,-88.440},
				{14919.613,260.759,10.000,-88.380},
				{14945.689,260.759,10.000,-88.320},
				{14971.765,260.759,10.000,-88.270},
				{14997.841,260.759,10.000,-88.210},
				{15023.917,260.759,10.000,-88.150},
				{15049.993,260.759,10.000,-88.090},
				{15076.069,260.759,10.000,-88.030},
				{15102.145,260.759,10.000,-87.970},
				{15128.221,260.759,10.000,-87.910},
				{15154.297,260.759,10.000,-87.840},
				{15180.373,260.759,10.000,-87.780},
				{15206.449,260.759,10.000,-87.710},
				{15232.525,260.759,10.000,-87.640},
				{15258.600,260.759,10.000,-87.570},
				{15284.676,260.759,10.000,-87.500},
				{15310.752,260.759,10.000,-87.430},
				{15336.828,260.759,10.000,-87.360},
				{15362.904,260.759,10.000,-87.290},
				{15388.980,260.759,10.000,-87.220},
				{15415.056,260.759,10.000,-87.140},
				{15441.132,260.759,10.000,-87.070},
				{15467.208,260.759,10.000,-86.990},
				{15493.284,260.759,10.000,-86.910},
				{15519.360,260.759,10.000,-86.830},
				{15545.436,260.759,10.000,-86.750},
				{15571.512,260.759,10.000,-86.670},
				{15597.588,260.759,10.000,-86.590},
				{15623.664,260.759,10.000,-86.500},
				{15649.740,260.759,10.000,-86.420},
				{15675.816,260.759,10.000,-86.330},
				{15701.892,260.759,10.000,-86.240},
				{15727.968,260.759,10.000,-86.150},
				{15754.043,260.759,10.000,-86.060},
				{15780.119,260.759,10.000,-85.970},
				{15806.195,260.759,10.000,-85.880},
				{15832.271,260.759,10.000,-85.790},
				{15858.347,260.759,10.000,-85.690},
				{15884.423,260.759,10.000,-85.590},
				{15910.499,260.759,10.000,-85.500},
				{15936.575,260.759,10.000,-85.400},
				{15962.651,260.759,10.000,-85.300},
				{15988.727,260.759,10.000,-85.200},
				{16014.803,260.759,10.000,-85.090},
				{16040.879,260.759,10.000,-84.990},
				{16066.955,260.759,10.000,-84.880},
				{16093.031,260.759,10.000,-84.780},
				{16119.107,260.759,10.000,-84.670},
				{16145.183,260.759,10.000,-84.560},
				{16171.259,260.759,10.000,-84.450},
				{16197.335,260.759,10.000,-84.340},
				{16223.410,260.759,10.000,-84.220},
				{16249.486,260.759,10.000,-84.110},
				{16275.562,260.759,10.000,-83.990},
				{16301.638,260.759,10.000,-83.870},
				{16327.714,260.759,10.000,-83.750},
				{16353.790,260.759,10.000,-83.630},
				{16379.866,260.759,10.000,-83.510},
				{16405.942,260.759,10.000,-83.390},
				{16432.018,260.759,10.000,-83.260},
				{16458.094,260.759,10.000,-83.130},
				{16484.170,260.759,10.000,-83.010},
				{16510.246,260.759,10.000,-82.880},
				{16536.322,260.759,10.000,-82.740},
				{16562.398,260.759,10.000,-82.610},
				{16588.474,260.759,10.000,-82.480},
				{16614.550,260.759,10.000,-82.340},
				{16640.626,260.759,10.000,-82.200},
				{16666.702,260.759,10.000,-82.060},
				{16692.778,260.759,10.000,-81.920},
				{16718.853,260.759,10.000,-81.780},
				{16744.929,260.759,10.000,-81.630},
				{16771.005,260.759,10.000,-81.490},
				{16797.081,260.759,10.000,-81.340},
				{16823.157,260.759,10.000,-81.190},
				{16849.233,260.759,10.000,-81.040},
				{16875.309,260.759,10.000,-80.890},
				{16901.385,260.759,10.000,-80.730},
				{16927.461,260.759,10.000,-80.570},
				{16953.537,260.759,10.000,-80.410},
				{16979.613,260.759,10.000,-80.250},
				{17005.689,260.759,10.000,-80.090},
				{17031.765,260.759,10.000,-79.930},
				{17057.841,260.759,10.000,-79.760},
				{17083.917,260.759,10.000,-79.590},
				{17109.993,260.759,10.000,-79.420},
				{17136.069,260.759,10.000,-79.250},
				{17162.145,260.759,10.000,-79.080},
				{17188.220,260.759,10.000,-78.900},
				{17214.296,260.759,10.000,-78.730},
				{17240.372,260.759,10.000,-78.550},
				{17266.448,260.759,10.000,-78.360},
				{17292.524,260.759,10.000,-78.180},
				{17318.600,260.759,10.000,-77.990},
				{17344.676,260.759,10.000,-77.810},
				{17370.752,260.759,10.000,-77.620},
				{17396.828,260.759,10.000,-77.420},
				{17422.904,260.759,10.000,-77.230},
				{17448.980,260.759,10.000,-77.030},
				{17475.056,260.759,10.000,-76.840},
				{17501.132,260.759,10.000,-76.630},
				{17527.208,260.759,10.000,-76.430},
				{17553.284,260.759,10.000,-76.230},
				{17579.360,260.759,10.000,-76.020},
				{17605.436,260.759,10.000,-75.810},
				{17631.512,260.759,10.000,-75.600},
				{17657.588,260.759,10.000,-75.380},
				{17683.663,260.759,10.000,-75.170},
				{17709.739,260.759,10.000,-74.950},
				{17735.815,260.759,10.000,-74.730},
				{17761.891,260.759,10.000,-74.500},
				{17787.967,260.759,10.000,-74.280},
				{17814.043,260.759,10.000,-74.050},
				{17840.119,260.759,10.000,-73.820},
				{17866.195,260.759,10.000,-73.590},
				{17892.271,260.759,10.000,-73.350},
				{17918.347,260.759,10.000,-73.110},
				{17944.423,260.759,10.000,-72.870},
				{17970.499,260.759,10.000,-72.630},
				{17996.575,260.759,10.000,-72.390},
				{18022.651,260.759,10.000,-72.140},
				{18048.727,260.759,10.000,-71.890},
				{18074.803,260.759,10.000,-71.640},
				{18100.879,260.759,10.000,-71.380},
				{18126.955,260.759,10.000,-71.120},
				{18153.030,260.759,10.000,-70.860},
				{18179.106,260.759,10.000,-70.600},
				{18205.182,260.759,10.000,-70.330},
				{18231.258,260.759,10.000,-70.060},
				{18257.334,260.759,10.000,-69.790},
				{18283.410,260.759,10.000,-69.520},
				{18309.486,260.759,10.000,-69.240},
				{18335.562,260.759,10.000,-68.970},
				{18361.638,260.759,10.000,-68.680},
				{18387.714,260.759,10.000,-68.400},
				{18413.790,260.759,10.000,-68.110},
				{18439.866,260.759,10.000,-67.820},
				{18465.942,260.759,10.000,-67.530},
				{18492.018,260.759,10.000,-67.240},
				{18518.094,260.759,10.000,-66.940},
				{18544.170,260.759,10.000,-66.640},
				{18570.246,260.759,10.000,-66.340},
				{18596.322,260.759,10.000,-66.030},
				{18622.398,260.759,10.000,-65.720},
				{18648.473,260.759,10.000,-65.410},
				{18674.549,260.759,10.000,-65.100},
				{18700.625,260.759,10.000,-64.780},
				{18726.701,260.759,10.000,-64.470},
				{18752.777,260.759,10.000,-64.140},
				{18778.853,260.759,10.000,-63.820},
				{18804.929,260.759,10.000,-63.490},
				{18831.005,260.759,10.000,-63.160},
				{18857.081,260.759,10.000,-62.830},
				{18883.157,260.759,10.000,-62.500},
				{18909.233,260.759,10.000,-62.160},
				{18935.309,260.759,10.000,-61.820},
				{18961.385,260.759,10.000,-61.480},
				{18987.461,260.759,10.000,-61.140},
				{19013.537,260.759,10.000,-60.790},
				{19039.613,260.759,10.000,-60.440},
				{19065.689,260.759,10.000,-60.090},
				{19091.765,260.759,10.000,-59.740},
				{19117.840,260.759,10.000,-59.380},
				{19143.916,260.759,10.000,-59.020},
				{19169.992,260.759,10.000,-58.660},
				{19196.068,260.759,10.000,-58.300},
				{19222.144,260.759,10.000,-57.930},
				{19248.220,260.759,10.000,-57.570},
				{19274.296,260.759,10.000,-57.200},
				{19300.372,260.759,10.000,-56.830},
				{19326.448,260.759,10.000,-56.450},
				{19352.524,260.759,10.000,-56.080},
				{19378.600,260.759,10.000,-55.700},
				{19404.676,260.759,10.000,-55.320},
				{19430.752,260.759,10.000,-54.940},
				{19456.828,260.759,10.000,-54.560},
				{19482.904,260.759,10.000,-54.170},
				{19508.980,260.759,10.000,-53.790},
				{19535.056,260.759,10.000,-53.400},
				{19561.132,260.759,10.000,-53.010},
				{19587.208,260.759,10.000,-52.620},
				{19613.283,260.759,10.000,-52.230},
				{19639.359,260.759,10.000,-51.830},
				{19665.435,260.759,10.000,-51.440},
				{19691.511,260.759,10.000,-51.040},
				{19717.587,260.759,10.000,-50.650},
				{19743.663,260.759,10.000,-50.250},
				{19769.739,260.759,10.000,-49.850},
				{19795.815,260.759,10.000,-49.450},
				{19821.891,260.759,10.000,-49.050},
				{19847.967,260.759,10.000,-48.650},
				{19874.043,260.759,10.000,-48.240},
				{19900.119,260.759,10.000,-47.840},
				{19926.195,260.759,10.000,-47.440},
				{19952.271,260.759,10.000,-47.030},
				{19978.347,260.759,10.000,-46.630},
				{20004.423,260.759,10.000,-46.230},
				{20030.499,260.759,10.000,-45.820},
				{20056.575,260.759,10.000,-45.420},
				{20082.650,260.759,10.000,-45.010},
				{20108.726,260.759,10.000,-44.600},
				{20134.802,260.759,10.000,-44.200},
				{20160.878,260.759,10.000,-43.790},
				{20186.954,260.759,10.000,-43.390},
				{20213.030,260.759,10.000,-42.990},
				{20239.106,260.759,10.000,-42.580},
				{20265.182,260.759,10.000,-42.180},
				{20291.258,260.759,10.000,-41.770},
				{20317.334,260.759,10.000,-41.370},
				{20343.410,260.759,10.000,-40.970},
				{20369.486,260.759,10.000,-40.570},
				{20395.562,260.759,10.000,-40.170},
				{20421.638,260.759,10.000,-39.770},
				{20447.714,260.759,10.000,-39.370},
				{20473.790,260.759,10.000,-38.980},
				{20499.866,260.759,10.000,-38.580},
				{20525.942,260.759,10.000,-38.180},
				{20552.018,260.759,10.000,-37.790},
				{20578.093,260.759,10.000,-37.400},
				{20604.169,260.759,10.000,-37.010},
				{20630.245,260.759,10.000,-36.620},
				{20656.321,260.759,10.000,-36.230},
				{20682.397,260.759,10.000,-35.840},
				{20708.473,260.759,10.000,-35.460},
				{20734.549,260.759,10.000,-35.080},
				{20760.625,260.759,10.000,-34.700},
				{20786.701,260.759,10.000,-34.320},
				{20812.777,260.759,10.000,-33.940},
				{20838.853,260.759,10.000,-33.560},
				{20864.929,260.759,10.000,-33.190},
				{20891.005,260.759,10.000,-32.820},
				{20917.081,260.759,10.000,-32.450},
				{20943.157,260.759,10.000,-32.080},
				{20969.233,260.759,10.000,-31.720},
				{20995.309,260.759,10.000,-31.350},
				{21021.385,260.759,10.000,-30.990},
				{21047.460,260.759,10.000,-30.630},
				{21073.536,260.759,10.000,-30.280},
				{21099.612,260.759,10.000,-29.920},
				{21125.688,260.759,10.000,-29.570},
				{21151.764,260.759,10.000,-29.220},
				{21177.840,260.759,10.000,-28.870},
				{21203.916,260.759,10.000,-28.530},
				{21229.992,260.759,10.000,-28.190},
				{21256.068,260.759,10.000,-27.850},
				{21282.144,260.759,10.000,-27.510},
				{21308.220,260.759,10.000,-27.180},
				{21334.296,260.759,10.000,-26.840},
				{21360.372,260.759,10.000,-26.520},
				{21386.448,260.759,10.000,-26.190},
				{21412.524,260.759,10.000,-25.860},
				{21438.600,260.759,10.000,-25.540},
				{21464.676,260.759,10.000,-25.220},
				{21490.752,260.759,10.000,-24.910},
				{21516.827,260.759,10.000,-24.590},
				{21542.903,260.759,10.000,-24.280},
				{21568.979,260.759,10.000,-23.970},
				{21595.055,260.759,10.000,-23.670},
				{21621.131,260.759,10.000,-23.370},
				{21647.207,260.759,10.000,-23.070},
				{21673.283,260.759,10.000,-22.770},
				{21699.359,260.759,10.000,-22.470},
				{21725.435,260.759,10.000,-22.180},
				{21751.511,260.759,10.000,-21.890},
				{21777.587,260.759,10.000,-21.600},
				{21803.663,260.759,10.000,-21.320},
				{21829.739,260.759,10.000,-21.040},
				{21855.815,260.759,10.000,-20.760},
				{21881.891,260.759,10.000,-20.480},
				{21907.967,260.759,10.000,-20.210},
				{21934.043,260.759,10.000,-19.940},
				{21960.119,260.759,10.000,-19.670},
				{21986.195,260.759,10.000,-19.400},
				{22012.270,260.759,10.000,-19.140},
				{22038.346,260.759,10.000,-18.880},
				{22064.422,260.759,10.000,-18.620},
				{22090.498,260.759,10.000,-18.360},
				{22116.574,260.759,10.000,-18.110},
				{22142.650,260.759,10.000,-17.860},
				{22168.726,260.759,10.000,-17.610},
				{22194.802,260.759,10.000,-17.370},
				{22220.878,260.759,10.000,-17.120},
				{22246.954,260.759,10.000,-16.880},
				{22273.030,260.759,10.000,-16.640},
				{22299.106,260.759,10.000,-16.410},
				{22325.182,260.759,10.000,-16.170},
				{22351.258,260.759,10.000,-15.940},
				{22377.334,260.759,10.000,-15.710},
				{22403.410,260.759,10.000,-15.490},
				{22429.486,260.759,10.000,-15.270},
				{22455.562,260.759,10.000,-15.040},
				{22481.637,260.759,10.000,-14.820},
				{22507.713,260.759,10.000,-14.610},
				{22533.789,260.759,10.000,-14.390},
				{22559.865,260.759,10.000,-14.180},
				{22585.941,260.759,10.000,-13.970},
				{22612.017,260.759,10.000,-13.760},
				{22638.093,260.759,10.000,-13.560},
				{22664.169,260.759,10.000,-13.360},
				{22690.245,260.759,10.000,-13.150},
				{22716.321,260.759,10.000,-12.960},
				{22742.397,260.759,10.000,-12.760},
				{22768.473,260.759,10.000,-12.560},
				{22794.549,260.759,10.000,-12.370},
				{22820.625,260.759,10.000,-12.180},
				{22846.701,260.759,10.000,-11.990},
				{22872.777,260.759,10.000,-11.810},
				{22898.853,260.759,10.000,-11.620},
				{22924.929,260.759,10.000,-11.440},
				{22951.005,260.759,10.000,-11.260},
				{22977.080,260.759,10.000,-11.080},
				{23003.156,260.759,10.000,-10.910},
				{23029.232,260.759,10.000,-10.730},
				{23055.308,260.759,10.000,-10.560},
				{23081.384,260.759,10.000,-10.390},
				{23107.460,260.759,10.000,-10.220},
				{23133.536,260.759,10.000,-10.060},
				{23159.612,260.759,10.000,-9.890},
				{23185.688,260.759,10.000,-9.730},
				{23211.764,260.759,10.000,-9.570},
				{23237.840,260.759,10.000,-9.410},
				{23263.916,260.759,10.000,-9.250},
				{23289.992,260.759,10.000,-9.100},
				{23316.068,260.759,10.000,-8.940},
				{23342.144,260.759,10.000,-8.790},
				{23368.220,260.759,10.000,-8.640},
				{23394.296,260.759,10.000,-8.490},
				{23420.372,260.759,10.000,-8.350},
				{23446.447,260.759,10.000,-8.200},
				{23472.523,260.759,10.000,-8.060},
				{23498.599,260.759,10.000,-7.920},
				{23524.675,260.759,10.000,-7.780},
				{23550.751,260.759,10.000,-7.640},
				{23576.827,260.759,10.000,-7.500},
				{23602.903,260.759,10.000,-7.370},
				{23628.979,260.759,10.000,-7.240},
				{23655.055,260.759,10.000,-7.100},
				{23681.131,260.759,10.000,-6.970},
				{23707.207,260.759,10.000,-6.850},
				{23733.283,260.759,10.000,-6.720},
				{23759.359,260.759,10.000,-6.590},
				{23785.435,260.759,10.000,-6.470},
				{23811.511,260.759,10.000,-6.350},
				{23837.587,260.759,10.000,-6.220},
				{23863.663,260.759,10.000,-6.100},
				{23889.739,260.759,10.000,-5.990},
				{23915.815,260.759,10.000,-5.870},
				{23941.890,260.759,10.000,-5.750},
				{23967.966,260.759,10.000,-5.640},
				{23994.042,260.759,10.000,-5.530},
				{24020.118,260.759,10.000,-5.420},
				{24046.194,260.759,10.000,-5.310},
				{24072.270,260.759,10.000,-5.200},
				{24098.346,260.759,10.000,-5.090},
				{24124.422,260.759,10.000,-4.990},
				{24150.498,260.759,10.000,-4.880},
				{24176.574,260.759,10.000,-4.780},
				{24202.650,260.759,10.000,-4.680},
				{24228.726,260.759,10.000,-4.580},
				{24254.802,260.759,10.000,-4.480},
				{24280.878,260.759,10.000,-4.380},
				{24306.954,260.759,10.000,-4.280},
				{24333.030,260.759,10.000,-4.190},
				{24359.106,260.759,10.000,-4.100},
				{24385.182,260.759,10.000,-4.000},
				{24411.257,260.759,10.000,-3.910},
				{24437.333,260.759,10.000,-3.820},
				{24463.409,260.759,10.000,-3.730},
				{24489.485,260.759,10.000,-3.640},
				{24515.561,260.759,10.000,-3.560},
				{24541.637,260.759,10.000,-3.470},
				{24567.713,260.759,10.000,-3.390},
				{24593.789,260.759,10.000,-3.310},
				{24619.865,260.759,10.000,-3.220},
				{24645.941,260.759,10.000,-3.140},
				{24672.017,260.759,10.000,-3.060},
				{24698.093,260.759,10.000,-2.990},
				{24724.169,260.759,10.000,-2.910},
				{24750.245,260.759,10.000,-2.830},
				{24776.321,260.759,10.000,-2.760},
				{24802.397,260.759,10.000,-2.680},
				{24828.473,260.759,10.000,-2.610},
				{24854.549,260.759,10.000,-2.540},
				{24880.625,260.759,10.000,-2.470},
				{24906.700,260.759,10.000,-2.400},
				{24932.776,260.759,10.000,-2.330},
				{24958.852,260.759,10.000,-2.260},
				{24984.928,260.759,10.000,-2.200},
				{25011.004,260.759,10.000,-2.130},
				{25037.080,260.759,10.000,-2.070},
				{25063.156,260.759,10.000,-2.000},
				{25089.232,260.759,10.000,-1.940},
				{25115.308,260.759,10.000,-1.880},
				{25141.384,260.759,10.000,-1.820},
				{25167.460,260.759,10.000,-1.760},
				{25193.536,260.759,10.000,-1.700},
				{25219.612,260.759,10.000,-1.650},
				{25245.688,260.759,10.000,-1.590},
				{25271.764,260.759,10.000,-1.540},
				{25297.840,260.759,10.000,-1.480},
				{25323.916,260.759,10.000,-1.430},
				{25349.992,260.759,10.000,-1.380},
				{25376.067,260.759,10.000,-1.330},
				{25402.143,260.759,10.000,-1.280},
				{25428.219,260.759,10.000,-1.230},
				{25454.295,260.759,10.000,-1.180},
				{25480.371,260.759,10.000,-1.130},
				{25506.447,260.759,10.000,-1.090},
				{25532.523,260.759,10.000,-1.040},
				{25558.599,260.759,10.000,-1.000},
				{25584.675,260.759,10.000,-0.950},
				{25610.751,260.759,10.000,-0.910},
				{25636.827,260.759,10.000,-0.870},
				{25662.903,260.759,10.000,-0.830},
				{25688.979,260.759,10.000,-0.790},
				{25715.055,260.759,10.000,-0.750},
				{25741.131,260.759,10.000,-0.720},
				{25767.207,260.759,10.000,-0.680},
				{25793.283,260.759,10.000,-0.640},
				{25819.359,260.759,10.000,-0.610},
				{25845.435,260.759,10.000,-0.580},
				{25871.510,260.759,10.000,-0.540},
				{25897.586,260.759,10.000,-0.510},
				{25923.662,260.759,10.000,-0.480},
				{25949.738,260.759,10.000,-0.450},
				{25975.814,260.759,10.000,-0.420},
				{26001.890,260.759,10.000,-0.390},
				{26027.966,260.759,10.000,-0.370},
				{26054.042,260.759,10.000,-0.340},
				{26080.118,260.759,10.000,-0.310},
				{26106.194,260.759,10.000,-0.290},
				{26132.270,260.759,10.000,-0.270},
				{26158.346,260.759,10.000,-0.240},
				{26184.422,260.759,10.000,-0.220},
				{26210.498,260.759,10.000,-0.200},
				{26236.574,260.759,10.000,-0.180},
				{26262.650,260.759,10.000,-0.160},
				{26288.726,260.759,10.000,-0.140},
				{26314.802,260.759,10.000,-0.130},
				{26340.877,260.759,10.000,-0.110},
				{26366.953,260.759,10.000,-0.100},
				{26393.029,260.759,10.000,-0.080},
				{26419.105,260.759,10.000,-0.070},
				{26445.181,260.759,10.000,-0.060},
				{26471.257,260.759,10.000,-0.040},
				{26497.333,260.759,10.000,-0.030},
				{26523.409,260.759,10.000,-0.020},
				{26549.485,260.759,10.000,-0.020},
				{26575.561,260.759,10.000,-0.010},
				{26601.637,260.759,10.000,0.000},
				{26627.713,260.759,10.000,0.000},
				{26651.703,239.899,10.000,0.010},
				{26673.607,219.038,10.000,0.010},
				{26693.424,198.177,10.000,0.020},
				{26711.156,177.316,10.000,0.020},
				{26726.801,156.456,10.000,0.020},
				{26740.361,135.595,10.000,0.020},
				{26751.834,114.734,10.000,0.020},
				{26761.222,93.873,10.000,0.020},
				{26768.523,73.013,10.000,0.020},
				{26773.738,52.152,10.000,0.020},
				{26776.867,31.291,10.000,0.020}		};

}