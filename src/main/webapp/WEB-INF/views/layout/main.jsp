<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"
	crossorigin="anonymous"></script>


<link rel="stylesheet" type="text/css"
	href="/yorijori/common/css/layout/test.css" />
<link rel="stylesheet" type="text/css"
	href="/yorijori/common/css/layout/footer.css" />
<link rel="stylesheet" type="text/css"
	href="/yorijori/common/css/main/main.css" />

<script src="/yorijori/common/js/mainpage/main.js"></script>



<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
<link rel="shortcut icon" href="images/icon/favicon13.ico">
<meta charset="UTF-8">
<meta charset="UTF-8">
</head>
<body>
	<!-- 헤더 -->
	<section id="hero" class="hero d-flex align-items-center section-bg">
		<div class="container">
			<div class="row justify-content-between gy-5">
				<div
					class="col-lg-5 order-2 order-lg-1 d-flex flex-column justify-content-center align-items-center align-items-lg-start text-center text-lg-start">
					<h2 data-aos="fade-up">
						간편하게 따라하는<br>요리 레시피
					</h2>
					<p data-aos="fade-up" data-aos-delay="100">맛있는 레시피를 비롯해, 다양한 요리
						팁과 노하우를 공유하고ㅤㅤㅤㅤㅤㅤㅤㅤㅤㅤ 참여자들과 함께 레시피를 등록하며 성장해보세요!</p>
					<div class="d-flex" data-aos="fade-up" data-aos-delay="200">
						<a href="#book-a-table" class="btn-book-a-table"
							style="text-decoration: none;">레시피 보기</a> <a href="#"
							class="glightbox btn-watch-video d-flex align-items-center"><i
							class="bi bi-play-circle"></i><span></span></a>
					</div>
				</div>
				<div
					class="col-lg-5 order-1 order-lg-2 text-center text-lg-start slide">
					<ul>
						<li><img src="images/main/product-1.jpg" class="img-fluid"
							alt="" data-aos="zoom-out" data-aos-delay="300"></li>
						<li><img src="images/main/product-2.jpg" class="img-fluid"
							alt="" data-aos="zoom-out" data-aos-delay="300"></li>
						<li><img src="images/main/product-3.jpg" class="img-fluid"
							alt="" data-aos="zoom-out" data-aos-delay="300"></li>
						<li><img src="images/main/product-4.jpg" class="img-fluid"
							alt="" data-aos="zoom-out" data-aos-delay="300"></li>
					</ul>
				</div>
			</div>
		</div>
	</section>
	<div class="container-xxl py-5">
		<div class="container">
			<div class="row g-0 gx-5 align-items-end">
				<div class="col-lg-6">
					<div class="section-header text-start mb-5 wow fadeInUp"
						data-wow-delay="0.1s" style="max-width: 500px;">
						<h1 class="display-5 mb-3">레시피 랭킹</h1>
					</div>
				</div>
			</div>

			<div class="tab-content">
				<div id="tab-1" class="tab-pane fade show p-0 active">
					<div class="row g-4">
						<div class="col-xl-3 col-lg-4 col-md-6 wow fadeInUp"
							data-wow-delay="0.1s">
							<div class="product-item">
								<div class="position-relative bg-light overflow-hidden">
									<img class="img-fluid w-100" src="images/main/product-1.jpg"
										alt="" width="512px" height="512px">
									<div
										class="bg-secondary rounded text-white position-absolute start-0 top-0 m-4 py-1 px-3">
										1위</div>
								</div>
								<div class="text-center p-4">
									<a class="d-block h5 mb-2" href="">된장찌개</a>
									<div style="font-size: 18px;">
										<i class="fa fa-heart me-2" style="color: red;"></i>3952
									</div>
								</div>
								<div class="d-flex border-top">
									<small class="w-50 text-center border-end py-2"> <a
										class="text-body"><i
											class="fa fa-clock-o text-primary me-2"></i>15분</a>
									</small> <small class="w-50 text-center py-2"> <a
										class="text-body" href=""><i
											class="fa fa-heart text-primary me-2"></i>찜하기</a>
									</small>
								</div>
							</div>
						</div>
						<div class="col-xl-3 col-lg-4 col-md-6 wow fadeInUp"
							data-wow-delay="0.3s">
							<div class="product-item">
								<div class="position-relative bg-light overflow-hidden">
									<img class="img-fluid w-100" src="images/main/product-2.jpg"
										alt="">
									<div
										class="bg-secondary rounded text-white position-absolute start-0 top-0 m-4 py-1 px-3">
										2위</div>
								</div>
								<div class="text-center p-4">
									<a class="d-block h5 mb-2" href="">가지볶음</a>
									<div style="font-size: 18px;">
										<i class="fa fa-heart me-2" style="color: red;"></i>3952
									</div>
								</div>
								<div class="d-flex border-top">
									<small class="w-50 text-center border-end py-2"> <a
										class="text-body"><i
											class="fa fa-clock-o text-primary me-2"></i>30분</a>
									</small> <small class="w-50 text-center py-2"> <a
										class="text-body" href=""><i
											class="fa fa-heart text-primary me-2"></i>찜하기</a>
									</small>
								</div>
							</div>
						</div>
						<div class="col-xl-3 col-lg-4 col-md-6 wow fadeInUp"
							data-wow-delay="0.5s">
							<div class="product-item">
								<div class="position-relative bg-light overflow-hidden">
									<img class="img-fluid w-100" src="images/main/product-3.jpg"
										alt="">
									<div
										class="bg-secondary rounded text-white position-absolute start-0 top-0 m-4 py-1 px-3">
										3위</div>
								</div>
								<div class="text-center p-4">
									<a class="d-block h5 mb-2" href="">장조림</a>
									<div style="font-size: 18px;">
										<i class="fa fa-heart me-2" style="color: red;"></i>3952
									</div>
								</div>
								<div class="d-flex border-top">
									<small class="w-50 text-center border-end py-2"> <a
										class="text-body"><i
											class="fa fa-clock-o text-primary me-2"></i>25분</a>
									</small> <small class="w-50 text-center py-2"> <a
										class="text-body" href=""><i
											class="fa fa-heart text-primary me-2"></i>찜하기</a>
									</small>
								</div>
							</div>
						</div>
						<div class="col-xl-3 col-lg-4 col-md-6 wow fadeInUp"
							data-wow-delay="0.7s">
							<div class="product-item">
								<div class="position-relative bg-light overflow-hidden">
									<img class="img-fluid w-100" src="images/main/product-4.jpg"
										alt="">
									<div
										class="bg-secondary rounded text-white position-absolute start-0 top-0 m-4 py-1 px-3">
										4위</div>
								</div>
								<div class="text-center p-4">
									<a class="d-block h5 mb-2" href="">오이 소박이</a>
									<div style="font-size: 18px;">
										<i class="fa fa-heart me-2" style="color: red;"></i>3952
									</div>
								</div>
								<div class="d-flex border-top">
									<small class="w-50 text-center border-end py-2"> <a
										class="text-body"><i
											class="fa fa-clock-o text-primary me-2"></i>10분</a>

									</small> <small class="w-50 text-center py-2"> <a
										class="text-body" href=""><i
											class="fa fa-heart text-primary me-2"></i>찜하기</a>
									</small>
								</div>
							</div>
						</div>
						<div class="col-xl-3 col-lg-4 col-md-6 wow fadeInUp"
							data-wow-delay="0.5s">
							<div class="product-item">
								<div class="position-relative bg-light overflow-hidden">
									<img class="img-fluid w-100" src="images/main/product-3.jpg"
										alt="">
									<div
										class="bg-secondary rounded text-white position-absolute start-0 top-0 m-4 py-1 px-3">
										3위</div>
								</div>
								<div class="text-center p-4">
									<a class="d-block h5 mb-2" href="">장조림</a>
									<div style="font-size: 18px;">
										<i class="fa fa-heart me-2" style="color: red;"></i>3952
									</div>
								</div>
								<div class="d-flex border-top">
									<small class="w-50 text-center border-end py-2"> <a
										class="text-body"><i
											class="fa fa-clock-o text-primary me-2"></i>25분</a>
									</small> <small class="w-50 text-center py-2"> <a
										class="text-body" href=""><i
											class="fa fa-heart text-primary me-2"></i>찜하기</a>
									</small>
								</div>
							</div>
						</div>
						<div class="col-xl-3 col-lg-4 col-md-6 wow fadeInUp"
							data-wow-delay="0.5s">
							<div class="product-item">
								<div class="position-relative bg-light overflow-hidden">
									<img class="img-fluid w-100" src="images/main/product-5.jpg"
										alt="">
									<div
										class="bg-secondary rounded text-white position-absolute start-0 top-0 m-4 py-1 px-3">
										3위</div>
								</div>
								<div class="text-center p-4">
									<a class="d-block h5 mb-2" href="">된장찌개</a>
									<div style="font-size: 18px;">
										<i class="fa fa-heart me-2" style="color: red;"></i>3952
									</div>
								</div>
								<div class="d-flex border-top">
									<small class="w-50 text-center border-end py-2"> <a
										class="text-body"><i
											class="fa fa-clock-o text-primary me-2"></i>25분</a>
									</small> <small class="w-50 text-center py-2"> <a
										class="text-body" href=""><i
											class="fa fa-heart text-primary me-2"></i>찜하기</a>
									</small>
								</div>
							</div>
						</div>
						<div class="col-xl-3 col-lg-4 col-md-6 wow fadeInUp"
							data-wow-delay="0.5s">
							<div class="product-item">
								<div class="position-relative bg-light overflow-hidden">
									<img class="img-fluid w-100" src="images/main/product-8.jpg"
										alt="">
									<div
										class="bg-secondary rounded text-white position-absolute start-0 top-0 m-4 py-1 px-3">
										3위</div>
								</div>
								<div class="text-center p-4">
									<a class="d-block h5 mb-2" href="">가지볶음</a>
									<div style="font-size: 18px;">
										<i class="fa fa-heart me-2" style="color: red;"></i>3952
									</div>
								</div>
								<div class="d-flex border-top">
									<small class="w-50 text-center border-end py-2"> <a
										class="text-body"><i
											class="fa fa-clock-o text-primary me-2"></i>25분</a>
									</small> <small class="w-50 text-center py-2"> <a
										class="text-body" href=""><i
											class="fa fa-heart text-primary me-2"></i>찜하기</a>
									</small>
								</div>
							</div>
						</div>
						<div class="col-xl-3 col-lg-4 col-md-6 wow fadeInUp"
							data-wow-delay="0.5s">
							<div class="product-item">
								<div class="position-relative bg-light overflow-hidden">
									<img class="img-fluid w-100" src="images/main/product-4.jpg"
										alt="">
									<div
										class="bg-secondary rounded text-white position-absolute start-0 top-0 m-4 py-1 px-3">
										3위</div>
								</div>
								<div class="text-center p-4">
									<a class="d-block h5 mb-2" href="">오이 소박이</a>
									<div style="font-size: 18px;">
										<i class="fa fa-heart me-2" style="color: red;"></i>3952
									</div>
								</div>
								<div class="d-flex border-top">
									<small class="w-50 text-center border-end py-2"> <a
										class="text-body"><i
											class="fa fa-clock-o text-primary me-2"></i>25분</a>
									</small> <small class="w-50 text-center py-2"> <a
										class="text-body" href=""><i
											class="fa fa-heart text-primary me-2"></i>찜하기</a>
									</small>
								</div>
							</div>
						</div>
						<div class="col-12 text-center wow fadeInUp" data-wow-delay="0.1s">
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- End Hero Section -->
	<section id="stats-counter" class="stats-counter"
		style="background-image: url(images/main/product-1.jpg);">
		<div class="container" data-aos="zoom-out">

			<div class="row gy-4">

				<div class="col-lg-3 col-md-6">
					<div class="stats-item text-center w-100 h-100">
						<span class="count-num">5323</span>
						<p>공유된 레시피</p>
					</div>
				</div>
				<!-- End Stats Item -->

				<div class="col-lg-3 col-md-6">
					<div class="stats-item text-center w-100 h-100">
						<span class="count-num">5320</span>
						<p>회원</p>
					</div>
				</div>
				<!-- End Stats Item -->

				<div class="col-lg-3 col-md-6">
					<div class="stats-item text-center w-100 h-100">
						<span class="count-num">2432</span>
						<p>게시물</p>
					</div>
				</div>
				<!-- End Stats Item -->

				<div class="col-lg-3 col-md-6">
					<div class="stats-item text-center w-100 h-100">
						<span class="count-num">22325</span>
						<p>댓글</p>
					</div>
				</div>
				<!-- End Stats Item -->
			</div>
		</div>
	</section>




</body>
</html>
