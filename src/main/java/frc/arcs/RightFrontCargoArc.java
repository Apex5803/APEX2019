package frc.arcs;

import com.team319.follower.SrxMotionProfile;
import com.team319.follower.SrxTrajectory;

public class RightFrontCargoArc extends SrxTrajectory {
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (2.00,13.50,0.00)
	// (8.00,13.00,0.00)
	// (12.00,12.50,0.00)
	
    public RightFrontCargoArc() {
		super();
		this.highGear = true;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public RightFrontCargoArc(boolean flipped) {
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
				{93.873,187.747,10.000,0.000},
				{114.734,208.608,10.000,0.010},
				{137.681,229.468,10.000,0.010},
				{162.714,250.329,10.000,0.010},
				{189.833,271.190,10.000,0.020},
				{219.038,292.051,10.000,0.030},
				{250.329,312.911,10.000,0.030},
				{283.706,333.772,10.000,0.040},
				{319.170,354.633,10.000,0.060},
				{356.719,375.494,10.000,0.070},
				{396.354,396.354,10.000,0.090},
				{438.076,417.215,10.000,0.100},
				{481.883,438.076,10.000,0.130},
				{527.777,458.937,10.000,0.150},
				{575.757,479.797,10.000,0.180},
				{625.823,500.658,10.000,0.210},
				{677.975,521.519,10.000,0.240},
				{732.213,542.380,10.000,0.280},
				{788.537,563.240,10.000,0.320},
				{846.947,584.101,10.000,0.370},
				{907.443,604.962,10.000,0.420},
				{970.025,625.823,10.000,0.480},
				{1034.694,646.683,10.000,0.540},
				{1101.448,667.544,10.000,0.600},
				{1170.288,688.405,10.000,0.670},
				{1241.215,709.266,10.000,0.750},
				{1314.228,730.126,10.000,0.830},
				{1389.326,750.987,10.000,0.920},
				{1466.511,771.848,10.000,1.020},
				{1545.782,792.709,10.000,1.120},
				{1627.139,813.570,10.000,1.220},
				{1710.582,834.430,10.000,1.340},
				{1796.111,855.291,10.000,1.460},
				{1883.726,876.152,10.000,1.580},
				{1973.428,897.013,10.000,1.710},
				{2065.215,917.873,10.000,1.850},
				{2159.088,938.734,10.000,2.000},
				{2255.048,959.595,10.000,2.150},
				{2353.093,980.456,10.000,2.310},
				{2453.225,1001.316,10.000,2.470},
				{2555.443,1022.177,10.000,2.640},
				{2659.746,1043.038,10.000,2.820},
				{2766.136,1063.899,10.000,3.000},
				{2874.612,1084.759,10.000,3.180},
				{2985.174,1105.620,10.000,3.380},
				{3097.822,1126.481,10.000,3.570},
				{3212.557,1147.342,10.000,3.770},
				{3329.377,1168.202,10.000,3.980},
				{3448.283,1189.063,10.000,4.190},
				{3569.275,1209.924,10.000,4.400},
				{3692.354,1230.785,10.000,4.610},
				{3817.518,1251.645,10.000,4.830},
				{3944.769,1272.506,10.000,5.050},
				{4074.106,1293.367,10.000,5.270},
				{4205.529,1314.228,10.000,5.490},
				{4339.037,1335.088,10.000,5.710},
				{4474.632,1355.949,10.000,5.930},
				{4612.313,1376.810,10.000,6.140},
				{4752.080,1397.671,10.000,6.360},
				{4893.934,1418.531,10.000,6.570},
				{5037.873,1439.392,10.000,6.780},
				{5183.898,1460.253,10.000,6.990},
				{5332.009,1481.114,10.000,7.180},
				{5482.207,1501.974,10.000,7.380},
				{5634.490,1522.835,10.000,7.560},
				{5788.860,1543.696,10.000,7.740},
				{5945.316,1564.557,10.000,7.910},
				{6101.771,1564.557,10.000,8.060},
				{6258.227,1564.557,10.000,8.210},
				{6414.683,1564.557,10.000,8.340},
				{6571.138,1564.557,10.000,8.460},
				{6727.594,1564.557,10.000,8.570},
				{6884.050,1564.557,10.000,8.660},
				{7040.505,1564.557,10.000,8.740},
				{7196.961,1564.557,10.000,8.810},
				{7353.417,1564.557,10.000,8.860},
				{7509.872,1564.557,10.000,8.900},
				{7666.328,1564.557,10.000,8.920},
				{7822.784,1564.557,10.000,8.930},
				{7979.239,1564.557,10.000,8.930},
				{8135.695,1564.557,10.000,8.910},
				{8292.151,1564.557,10.000,8.880},
				{8448.606,1564.557,10.000,8.840},
				{8605.062,1564.557,10.000,8.780},
				{8761.518,1564.557,10.000,8.700},
				{8917.973,1564.557,10.000,8.620},
				{9074.429,1564.557,10.000,8.520},
				{9230.885,1564.557,10.000,8.400},
				{9387.341,1564.557,10.000,8.280},
				{9543.796,1564.557,10.000,8.140},
				{9700.252,1564.557,10.000,7.990},
				{9856.708,1564.557,10.000,7.820},
				{10013.163,1564.557,10.000,7.650},
				{10169.619,1564.557,10.000,7.460},
				{10326.075,1564.557,10.000,7.270},
				{10482.530,1564.557,10.000,7.060},
				{10638.986,1564.557,10.000,6.850},
				{10795.442,1564.557,10.000,6.620},
				{10951.897,1564.557,10.000,6.390},
				{11108.353,1564.557,10.000,6.150},
				{11264.809,1564.557,10.000,5.900},
				{11421.264,1564.557,10.000,5.650},
				{11575.634,1543.696,10.000,5.390},
				{11727.917,1522.835,10.000,5.130},
				{11878.115,1501.974,10.000,4.880},
				{12026.226,1481.114,10.000,4.620},
				{12172.252,1460.253,10.000,4.370},
				{12316.191,1439.392,10.000,4.110},
				{12458.044,1418.531,10.000,3.860},
				{12597.811,1397.671,10.000,3.620},
				{12735.492,1376.810,10.000,3.380},
				{12871.087,1355.949,10.000,3.140},
				{13004.596,1335.088,10.000,2.920},
				{13136.018,1314.228,10.000,2.690},
				{13265.355,1293.367,10.000,2.480},
				{13392.606,1272.506,10.000,2.270},
				{13517.770,1251.645,10.000,2.070},
				{13640.849,1230.785,10.000,1.880},
				{13761.841,1209.924,10.000,1.700},
				{13880.748,1189.063,10.000,1.520},
				{13997.568,1168.202,10.000,1.360},
				{14112.302,1147.342,10.000,1.200},
				{14224.950,1126.481,10.000,1.060},
				{14335.512,1105.620,10.000,0.920},
				{14443.988,1084.759,10.000,0.790},
				{14550.378,1063.899,10.000,0.680},
				{14654.682,1043.038,10.000,0.570},
				{14756.899,1022.177,10.000,0.470},
				{14857.031,1001.316,10.000,0.380},
				{14955.076,980.456,10.000,0.310},
				{15051.036,959.595,10.000,0.240},
				{15144.909,938.734,10.000,0.180},
				{15236.697,917.873,10.000,0.130},
				{15326.398,897.013,10.000,0.090},
				{15414.013,876.152,10.000,0.050},
				{15499.542,855.291,10.000,0.030},
				{15582.985,834.430,10.000,0.010},
				{15664.342,813.570,10.000,0.000},
				{15664.342,813.570,10.000,0.000},
				{15747.785,834.430,10.000,0.000},
				{15833.314,855.291,10.000,0.020},
				{15920.930,876.152,10.000,0.070},
				{16010.631,897.013,10.000,0.150},
				{16102.418,917.873,10.000,0.250},
				{16196.292,938.734,10.000,0.390},
				{16292.251,959.595,10.000,0.550},
				{16390.297,980.456,10.000,0.740},
				{16490.428,1001.316,10.000,0.960},
				{16592.646,1022.177,10.000,1.210},
				{16696.950,1043.038,10.000,1.480},
				{16803.340,1063.899,10.000,1.780},
				{16911.815,1084.759,10.000,2.110},
				{17022.377,1105.620,10.000,2.470},
				{17135.026,1126.481,10.000,2.850},
				{17249.760,1147.342,10.000,3.250},
				{17366.580,1168.202,10.000,3.670},
				{17485.486,1189.063,10.000,4.120},
				{17606.479,1209.924,10.000,4.580},
				{17729.557,1230.785,10.000,5.050},
				{17854.722,1251.645,10.000,5.540},
				{17981.972,1272.506,10.000,6.040},
				{18111.309,1293.367,10.000,6.550},
				{18241.689,1303.797,10.000,7.060},
				{18372.068,1303.797,10.000,7.560},
				{18502.448,1303.797,10.000,8.060},
				{18632.828,1303.797,10.000,8.540},
				{18763.208,1303.797,10.000,9.010},
				{18893.587,1303.797,10.000,9.460},
				{19023.967,1303.797,10.000,9.900},
				{19154.347,1303.797,10.000,10.320},
				{19284.727,1303.797,10.000,10.710},
				{19415.106,1303.797,10.000,11.080},
				{19545.486,1303.797,10.000,11.430},
				{19675.866,1303.797,10.000,11.760},
				{19806.245,1303.797,10.000,12.050},
				{19936.625,1303.797,10.000,12.320},
				{20067.005,1303.797,10.000,12.560},
				{20197.385,1303.797,10.000,12.770},
				{20327.764,1303.797,10.000,12.950},
				{20458.144,1303.797,10.000,13.090},
				{20588.524,1303.797,10.000,13.210},
				{20718.904,1303.797,10.000,13.290},
				{20849.283,1303.797,10.000,13.350},
				{20979.663,1303.797,10.000,13.370},
				{21110.043,1303.797,10.000,13.350},
				{21240.422,1303.797,10.000,13.310},
				{21370.802,1303.797,10.000,13.230},
				{21501.182,1303.797,10.000,13.130},
				{21631.562,1303.797,10.000,12.990},
				{21761.941,1303.797,10.000,12.820},
				{21892.321,1303.797,10.000,12.610},
				{22022.701,1303.797,10.000,12.380},
				{22153.081,1303.797,10.000,12.120},
				{22283.460,1303.797,10.000,11.830},
				{22411.754,1282.937,10.000,11.520},
				{22537.962,1262.076,10.000,11.190},
				{22662.083,1241.215,10.000,10.850},
				{22784.118,1220.354,10.000,10.480},
				{22904.068,1199.494,10.000,10.110},
				{23021.931,1178.633,10.000,9.720},
				{23137.708,1157.772,10.000,9.330},
				{23251.399,1136.911,10.000,8.930},
				{23363.004,1116.050,10.000,8.530},
				{23472.523,1095.190,10.000,8.120},
				{23579.956,1074.329,10.000,7.720},
				{23685.303,1053.468,10.000,7.310},
				{23788.564,1032.607,10.000,6.910},
				{23889.739,1011.747,10.000,6.520},
				{23988.827,990.886,10.000,6.130},
				{24085.830,970.025,10.000,5.750},
				{24180.746,949.164,10.000,5.380},
				{24273.576,928.304,10.000,5.010},
				{24364.321,907.443,10.000,4.660},
				{24452.979,886.582,10.000,4.320},
				{24539.551,865.721,10.000,4.000},
				{24624.037,844.861,10.000,3.680},
				{24706.437,824.000,10.000,3.380},
				{24786.751,803.139,10.000,3.100},
				{24864.979,782.278,10.000,2.820},
				{24941.121,761.418,10.000,2.570},
				{25015.176,740.557,10.000,2.320},
				{25087.146,719.696,10.000,2.090},
				{25157.030,698.835,10.000,1.880},
				{25224.827,677.975,10.000,1.680},
				{25290.538,657.114,10.000,1.500},
				{25354.164,636.253,10.000,1.320},
				{25415.703,615.392,10.000,1.170},
				{25475.156,594.532,10.000,1.020},
				{25532.523,573.671,10.000,0.890},
				{25587.804,552.810,10.000,0.770},
				{25640.999,531.949,10.000,0.660},
				{25692.108,511.089,10.000,0.560},
				{25741.131,490.228,10.000,0.480},
				{25788.067,469.367,10.000,0.400},
				{25832.918,448.506,10.000,0.330},
				{25875.683,427.646,10.000,0.270},
				{25916.361,406.785,10.000,0.220},
				{25954.953,385.924,10.000,0.180},
				{25991.460,365.063,10.000,0.140},
				{26025.880,344.202,10.000,0.110},
				{26058.214,323.342,10.000,0.080},
				{26088.462,302.481,10.000,0.060},
				{26116.624,281.620,10.000,0.040},
				{26142.700,260.759,10.000,0.030},
				{26166.690,239.899,10.000,0.020},
				{26188.594,219.038,10.000,0.010},
				{26208.412,198.177,10.000,0.010},
				{26226.143,177.316,10.000,0.000},
				{26241.789,156.456,10.000,0.000},
				{26255.348,135.595,10.000,0.000},
				{26266.822,114.734,10.000,0.000},
				{26276.209,93.873,10.000,0.000},
				{26283.510,73.013,10.000,0.000},
				{26288.726,52.152,10.000,0.000},
				{26291.855,31.291,10.000,0.000}		};

}