<!DOCTYPE html>
<html class="no-js css-menubar" lang="en">

<!-- Mirrored from getbootstrapadmin.com/remark/mmenu/uikit/modals.html by HTTrack Website Copier/3.x [XR&CO'2014], Fri, 10 May 2019 07:47:24 GMT -->
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimal-ui">
  <meta name="description" content="bootstrap admin template">
  <meta name="author" content="">

  <title>LPMP - Seven Tools</title>

  <script type="text/javascript">
    var datefield=document.createElement("input")
    datefield.setAttribute("type", "date")
      if (datefield.type!="date"){ //if browser doesn't support input type="date", load files for jQuery UI Date Picker
        document.write('<link href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/themes/base/jquery-ui.css" rel="stylesheet" type="text/css" />\n')
      document.write('<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.4/jquery.min.js"><\/script>\n')
      document.write('<script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/jquery-ui.min.js"><\/script>\n') 
    }
  </script>

  <script>
  if (datefield.type!="date"){ //if browser doesn't support input type="date", initialize date picker widget:
      jQuery(function($){ //on document.ready
        $('#tanggal_periksa').datepicker({ dateFormat: 'yy-mm-dd' });
      })
  }
</script>

<link rel="apple-touch-icon" href="<?php echo base_url('assets/web/');?>assets/images/apple-touch-icon.png">
<link rel="shortcut icon" href="<?php echo base_url('assets/web/');?>assets/images/favicon.ico">

<!-- Stylesheets -->
<link rel="stylesheet" href="<?php echo base_url('assets/web/');?>global/css/bootstrap.min599c.css?v4.0.2">
<link rel="stylesheet" href="<?php echo base_url('assets/web/');?>global/css/bootstrap-extend.min599c.css?v4.0.2">
<link rel="stylesheet" href="<?php echo base_url('assets/web/');?>assets/css/site.min599c.css?v4.0.2">

<!-- Skin tools (demo site only) -->
<link rel="stylesheet" href="<?php echo base_url('assets/web/');?>global/css/skintools.min599c.css?v4.0.2">
<script src="<?php echo base_url('assets/web/');?>assets/js/Plugin/skintools.min599c.js?v4.0.2"></script>

<!-- Plugins -->

<link rel="stylesheet" href="<?php echo base_url('assets/web/');?>global/vendor/select2/select2.min599c.css?v4.0.2">

<link rel="stylesheet" href="<?php echo base_url('assets/web/');?>global/vendor/animsition/animsition.min599c.css?v4.0.2">
<link rel="stylesheet" href="<?php echo base_url('assets/web/');?>global/vendor/asscrollable/asScrollable.min599c.css?v4.0.2">
<link rel="stylesheet" href="<?php echo base_url('assets/web/');?>global/vendor/switchery/switchery.min599c.css?v4.0.2">
<link rel="stylesheet" href="<?php echo base_url('assets/web/');?>global/vendor/intro-js/introjs.min599c.css?v4.0.2">
<link rel="stylesheet" href="<?php echo base_url('assets/web/');?>global/vendor/slidepanel/slidePanel.min599c.css?v4.0.2">
<link rel="stylesheet" href="<?php echo base_url('assets/web/');?>global/vendor/jquery-mmenu/jquery-mmenu.min599c.css?v4.0.2">
<link rel="stylesheet" href="<?php echo base_url('assets/web/');?>global/vendor/flag-icon-css/flag-icon.min599c.css?v4.0.2">

<!-- Plugins For This Page -->
<link rel="stylesheet" href="<?php echo base_url('assets/web/');?>global/vendor/datatables.net-bs4/dataTables.bootstrap4.min599c.css?v4.0.2">
<link rel="stylesheet" href="<?php echo base_url('assets/web/');?>global/vendor/datatables.net-fixedheader-bs4/dataTables.fixedheader.bootstrap4.min599c.css?v4.0.2">
<link rel="stylesheet" href="<?php echo base_url('assets/web/');?>global/vendor/datatables.net-fixedcolumns-bs4/dataTables.fixedcolumns.bootstrap4.min599c.css?v4.0.2">
<link rel="stylesheet" href="<?php echo base_url('assets/web/');?>global/vendor/datatables.net-rowgroup-bs4/dataTables.rowgroup.bootstrap4.min599c.css?v4.0.2">
<link rel="stylesheet" href="<?php echo base_url('assets/web/');?>global/vendor/datatables.net-scroller-bs4/dataTables.scroller.bootstrap4.min599c.css?v4.0.2">
<link rel="stylesheet" href="<?php echo base_url('assets/web/');?>global/vendor/datatables.net-select-bs4/dataTables.select.bootstrap4.min599c.css?v4.0.2">
<link rel="stylesheet" href="<?php echo base_url('assets/web/');?>global/vendor/datatables.net-responsive-bs4/dataTables.responsive.bootstrap4.min599c.css?v4.0.2">
<link rel="stylesheet" href="<?php echo base_url('assets/web/');?>global/vendor/datatables.net-buttons-bs4/dataTables.buttons.bootstrap4.min599c.css?v4.0.2">

<!-- Page -->
<link rel="stylesheet" href="<?php echo base_url('assets/web/');?>assets/examples/css/uikit/modals.min599c.css?v4.0.2">

<!-- Fonts -->
<link rel="stylesheet" href="<?php echo base_url('assets/web/');?>global/fonts/web-icons/web-icons.min599c.css?v4.0.2">
<link rel="stylesheet" href="<?php echo base_url('assets/web/');?>global/fonts/brand-icons/brand-icons.min599c.css?v4.0.2">
<link rel='stylesheet' href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,300italic">




  <!--[if lt IE 9]>
    <script src="<?php echo base_url('assets/web/');?>global/vendor/html5shiv/html5shiv.min.js?v4.0.2"></script>
  <![endif]-->

  <!--[if lt IE 10]>
    <script src="<?php echo base_url('assets/web/');?>global/vendor/media-match/media.match.min.js?v4.0.2"></script>
    <script src="<?php echo base_url('assets/web/');?>global/vendor/respond/respond.min.js?v4.0.2"></script>
  <![endif]-->

  <!-- Scripts -->
  <script src="<?php echo base_url('assets/web/');?>global/vendor/breakpoints/breakpoints.min599c.js?v4.0.2"></script>
  <script>
    Breakpoints();
  </script>
</head>
<body class="animsition site-navbar-small ">
  <!--[if lt IE 8]>
        <p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
      <![endif]-->

      <nav class="site-navbar navbar navbar-default navbar-fixed-top navbar-mega" role="navigation">

        <div class="navbar-header">
          <button type="button" class="navbar-toggler hamburger hamburger-close navbar-toggler-left hided"
          data-toggle="menubar">
          <span class="sr-only">Toggle navigation</span>
          <span class="hamburger-bar"></span>
        </button>
        <button type="button" class="navbar-toggler collapsed" data-target="#site-navbar-collapse"
        data-toggle="collapse">
        <i class="icon wb-more-horizontal" aria-hidden="true"></i>
      </button>
      <div class="navbar-brand navbar-brand-center site-gridmenu-toggle" data-toggle="gridmenu">
        <img class="navbar-brand-logo" src="<?php echo base_url('assets/web/');?>assets/images/logo.png" title="Remark">
        <span class="navbar-brand-text hidden-xs-down">LPMP - Seven Tools</span>
      </div>
      <button type="button" class="navbar-toggler collapsed" data-target="#site-navbar-search"
      data-toggle="collapse">
      <span class="sr-only">Toggle Search</span>
      <i class="icon wb-search" aria-hidden="true"></i>
    </button>
  </div>

  <div class="navbar-container container-fluid">
    <!-- Navbar Collapse -->
    <div class="collapse navbar-collapse navbar-collapse-toolbar" id="site-navbar-collapse">
      <!-- Navbar Toolbar -->
      <ul class="nav navbar-toolbar">
        <li class="nav-item hidden-float" id="toggleMenubar">
          <a class="nav-link" data-toggle="menubar" href="#" role="button">
            <i class="icon hamburger hamburger-arrow-left">
              <span class="sr-only">Toggle menubar</span>
              <span class="hamburger-bar"></span>
            </i>
          </a>
        </li>
        <li class="nav-item hidden-sm-down" id="toggleFullscreen">
          <a class="nav-link icon icon-fullscreen" data-toggle="fullscreen" href="#" role="button">
            <span class="sr-only">Toggle fullscreen</span>
          </a>
        </li>
        <!-- SEARCH MENU
          <li class="nav-item hidden-float">
            <a class="nav-link icon wb-search" data-toggle="collapse" href="#" data-target="#site-navbar-search" role="button">
              <span class="sr-only">Toggle Search</span>
            </a>
          </li>
        -->
      <!-- MEGA MENU
              <li class="nav-item dropdown dropdown-fw dropdown-mega">
                <a class="nav-link" data-toggle="dropdown" href="#" aria-expanded="false" data-animation="fade"
                role="button">Mega <i class="icon wb-chevron-down-mini" aria-hidden="true"></i></a>
                <div class="dropdown-menu" role="menu">
                  <div class="mega-content">
                    <div class="row">
                      <div class="col-md-4">
                        <h5>UI Kit</h5>
                        <ul class="blocks-2">
                          <li class="mega-menu m-0">
                            <ul class="list-icons">
                              <li><i class="wb-chevron-right-mini" aria-hidden="true"></i>
                                <a
                                href="../advanced/animation.html">Animation</a>
                              </li>
                              <li><i class="wb-chevron-right-mini" aria-hidden="true"></i>
                                <a
                                href="buttons.html">Buttons</a>
                              </li>
                              <li><i class="wb-chevron-right-mini" aria-hidden="true"></i>
                                <a
                                href="colors.html">Colors</a>
                              </li>
                              <li><i class="wb-chevron-right-mini" aria-hidden="true"></i>
                                <a
                                href="dropdowns.html">Dropdowns</a>
                              </li>
                              <li><i class="wb-chevron-right-mini" aria-hidden="true"></i>
                                <a
                                href="icons.html">Icons</a>
                              </li>
                              <li><i class="wb-chevron-right-mini" aria-hidden="true"></i>
                                <a
                                href="../advanced/lightbox.html">Lightbox</a>
                              </li>
                            </ul>
                          </li>
                          <li class="mega-menu m-0">
                            <ul class="list-icons">
                              <li><i class="wb-chevron-right-mini" aria-hidden="true"></i>
                                <a
                                href="modals.html">Modals</a>
                              </li>
                              <li><i class="wb-chevron-right-mini" aria-hidden="true"></i>
                                <a
                                href="panel-structure.html">Panels</a>
                              </li>
                              <li><i class="wb-chevron-right-mini" aria-hidden="true"></i>
                                <a
                                href="../structure/overlay.html">Overlay</a>
                              </li>
                              <li><i class="wb-chevron-right-mini" aria-hidden="true"></i>
                                <a
                                href="tooltip-popover.html">Tooltips</a>
                              </li>
                              <li><i class="wb-chevron-right-mini" aria-hidden="true"></i>
                                <a
                                href="../advanced/scrollable.html">Scrollable</a>
                              </li>
                              <li><i class="wb-chevron-right-mini" aria-hidden="true"></i>
                                <a
                                href="typography.html">Typography</a>
                              </li>
                            </ul>
                          </li>
                        </ul>
                      </div>
                      <div class="col-md-4">
                        <h5>Media
                          <span class="badge badge-pill badge-success">4</span>
                        </h5>
                        <ul class="blocks-3">
                          <li>
                            <a class="thumbnail m-0" href="javascript:void(0)">
                              <img class="w-full" src="<?php echo base_url('assets/web/');?>global/photos/view-1-150x100.jpg" alt="..." />
                            </a>
                          </li>
                          <li>
                            <a class="thumbnail m-0" href="javascript:void(0)">
                              <img class="w-full" src="<?php echo base_url('assets/web/');?>global/photos/view-2-150x100.jpg" alt="..." />
                            </a>
                          </li>
                          <li>
                            <a class="thumbnail m-0" href="javascript:void(0)">
                              <img class="w-full" src="<?php echo base_url('assets/web/');?>global/photos/view-3-150x100.jpg" alt="..." />
                            </a>
                          </li>
                          <li>
                            <a class="thumbnail m-0" href="javascript:void(0)">
                              <img class="w-full" src="<?php echo base_url('assets/web/');?>global/photos/view-4-150x100.jpg" alt="..." />
                            </a>
                          </li>
                          <li>
                            <a class="thumbnail m-0" href="javascript:void(0)">
                              <img class="w-full" src="<?php echo base_url('assets/web/');?>global/photos/view-5-150x100.jpg" alt="..." />
                            </a>
                          </li>
                          <li>
                            <a class="thumbnail m-0" href="javascript:void(0)">
                              <img class="w-full" src="<?php echo base_url('assets/web/');?>global/photos/view-6-150x100.jpg" alt="..." />
                            </a>
                          </li>
                        </ul>
                      </div>
                      <div class="col-md-4">
                        <h5 class="mb-0">Accordion</h5>
                        <!-- Accordion
                        <div class="panel-group panel-group-simple" id="siteMegaAccordion" aria-multiselectable="true"
                        role="tablist">
                        <div class="panel">
                          <div class="panel-heading" id="siteMegaAccordionHeadingOne" role="tab">
                            <a class="panel-title" data-toggle="collapse" href="#siteMegaCollapseOne" data-parent="#siteMegaAccordion"
                            aria-expanded="false" aria-controls="siteMegaCollapseOne">
                            Collapsible Group Item #1
                          </a>
                        </div>
                        <div class="panel-collapse collapse" id="siteMegaCollapseOne" aria-labelledby="siteMegaAccordionHeadingOne"
                        role="tabpanel">
                        <div class="panel-body">
                          De moveat laudatur vestra parum doloribus labitur sentire partes, eripuit praesenti
                          congressus ostendit alienae, voluptati ornateque accusamus
                          clamat reperietur convicia albucius.
                        </div>
                      </div>
                    </div>
                    <div class="panel">
                      <div class="panel-heading" id="siteMegaAccordionHeadingTwo" role="tab">
                        <a class="panel-title collapsed" data-toggle="collapse" href="#siteMegaCollapseTwo"
                        data-parent="#siteMegaAccordion" aria-expanded="false"
                        aria-controls="siteMegaCollapseTwo">
                        Collapsible Group Item #2
                      </a>
                    </div>
                    <div class="panel-collapse collapse" id="siteMegaCollapseTwo" aria-labelledby="siteMegaAccordionHeadingTwo"
                    role="tabpanel">
                    <div class="panel-body">
                      Praestabiliorem. Pellat excruciant legantur ullum leniter vacare foris voluptate
                      loco ignavi, credo videretur multoque choro fatemur
                      mortis animus adoptionem, bello statuat expediunt naturales.
                    </div>
                  </div>
                </div>

                <div class="panel">
                  <div class="panel-heading" id="siteMegaAccordionHeadingThree" role="tab">
                    <a class="panel-title collapsed" data-toggle="collapse" href="#siteMegaCollapseThree"
                    data-parent="#siteMegaAccordion" aria-expanded="false"
                    aria-controls="siteMegaCollapseThree">
                    Collapsible Group Item #3
                  </a>
                </div>
                <div class="panel-collapse collapse" id="siteMegaCollapseThree" aria-labelledby="siteMegaAccordionHeadingThree"
                role="tabpanel">
                <div class="panel-body">
                  Horum, antiquitate perciperet d conspectum locus obruamus animumque perspici probabis
                  suscipere. Desiderat magnum, contenta poena desiderant
                  concederetur menandri damna disputandum corporum.
                </div>
              </div>
            </div>
          </div>
          <!-- End Accordion 
        </div>
        </div>
        </div>
        </div>
        </li>
      -->
    </ul>
    <!-- End Navbar Toolbar -->

    <!-- Navbar Toolbar Right -->
    <ul class="nav navbar-toolbar navbar-right navbar-toolbar-right">

  <!-- NEGARA
  <li class="nav-item dropdown">
      <a class="nav-link" data-toggle="dropdown" href="javascript:void(0)" data-animation="scale-up"
      aria-expanded="false" role="button">
      <span class="flag-icon flag-icon-us"></span>
    </a>
    <div class="dropdown-menu" role="menu">
      <a class="dropdown-item" href="javascript:void(0)" role="menuitem">
        <span class="flag-icon flag-icon-gb"></span> English
      </a>
      <a class="dropdown-item" href="javascript:void(0)" role="menuitem">
        <span class="flag-icon flag-icon-fr"></span> French
      </a>
      <a class="dropdown-item" href="javascript:void(0)" role="menuitem">
        <span class="flag-icon flag-icon-cn"></span> Chinese
      </a>
      <a class="dropdown-item" href="javascript:void(0)" role="menuitem">
        <span class="flag-icon flag-icon-de"></span> German
      </a>
      <a class="dropdown-item" href="javascript:void(0)" role="menuitem">
        <span class="flag-icon flag-icon-nl"></span> Dutch
      </a>
    </div>
  </li>
-->

<!-- NOTIFIKASI
<li class="nav-item dropdown">
  <a class="nav-link" data-toggle="dropdown" href="javascript:void(0)" title="Notifications"
  aria-expanded="false" data-animation="scale-up" role="button">
  <i class="icon wb-bell" aria-hidden="true"></i>
  <span class="badge badge-pill badge-danger up">7</span>
</a>
<div class="dropdown-menu dropdown-menu-right dropdown-menu-media" role="menu">
  <div class="dropdown-menu-header">
    <h5>NOTIFICATIONS</h5>
    <span class="badge badge-round badge-danger">New 5</span>
  </div>

  <div class="list-group">
    <div data-role="container">
      <div data-role="content">
        <a class="list-group-item dropdown-item" href="javascript:void(0)" role="menuitem">
          <div class="media">
            <div class="pr-10">
              <i class="icon wb-order bg-red-600 white icon-circle" aria-hidden="true"></i>
            </div>
            <div class="media-body">
              <h6 class="media-heading">A new order has been placed</h6>
              <time class="media-meta" datetime="2018-06-12T20:50:48+08:00">5 hours ago</time>
            </div>
          </div>
        </a>
        <a class="list-group-item dropdown-item" href="javascript:void(0)" role="menuitem">
          <div class="media">
            <div class="pr-10">
              <i class="icon wb-user bg-green-600 white icon-circle" aria-hidden="true"></i>
            </div>
            <div class="media-body">
              <h6 class="media-heading">Completed the task</h6>
              <time class="media-meta" datetime="2018-06-11T18:29:20+08:00">2 days ago</time>
            </div>
          </div>
        </a>
        <a class="list-group-item dropdown-item" href="javascript:void(0)" role="menuitem">
          <div class="media">
            <div class="pr-10">
              <i class="icon wb-settings bg-red-600 white icon-circle" aria-hidden="true"></i>
            </div>
            <div class="media-body">
              <h6 class="media-heading">Settings updated</h6>
              <time class="media-meta" datetime="2018-06-11T14:05:00+08:00">2 days ago</time>
            </div>
          </div>
        </a>
        <a class="list-group-item dropdown-item" href="javascript:void(0)" role="menuitem">
          <div class="media">
            <div class="pr-10">
              <i class="icon wb-calendar bg-blue-600 white icon-circle" aria-hidden="true"></i>
            </div>
            <div class="media-body">
              <h6 class="media-heading">Event started</h6>
              <time class="media-meta" datetime="2018-06-10T13:50:18+08:00">3 days ago</time>
            </div>
          </div>
        </a>
        <a class="list-group-item dropdown-item" href="javascript:void(0)" role="menuitem">
          <div class="media">
            <div class="pr-10">
              <i class="icon wb-chat bg-orange-600 white icon-circle" aria-hidden="true"></i>
            </div>
            <div class="media-body">
              <h6 class="media-heading">Message received</h6>
              <time class="media-meta" datetime="2018-06-10T12:34:48+08:00">3 days ago</time>
            </div>
          </div>
        </a>
      </div>
    </div>
  </div>
  <div class="dropdown-menu-footer">
    <a class="dropdown-menu-footer-btn" href="javascript:void(0)" role="button">
      <i class="icon wb-settings" aria-hidden="true"></i>
    </a>
    <a class="dropdown-item" href="javascript:void(0)" role="menuitem">
      All notifications
    </a>
  </div>
</div>
</li>
-->


<!-- PESAN
  <li class="nav-item dropdown">
    <a class="nav-link" data-toggle="dropdown" href="javascript:void(0)" title="Messages"
    aria-expanded="false" data-animation="scale-up" role="button">
    <i class="icon wb-envelope" aria-hidden="true"></i>
    <span class="badge badge-pill badge-info up">3</span>
  </a>
  <div class="dropdown-menu dropdown-menu-right dropdown-menu-media" role="menu">
    <div class="dropdown-menu-header" role="presentation">
      <h5>MESSAGES</h5>
      <span class="badge badge-round badge-info">New 3</span>
    </div>

    <div class="list-group" role="presentation">
      <div data-role="container">
        <div data-role="content">
          <a class="list-group-item" href="javascript:void(0)" role="menuitem">
            <div class="media">
              <div class="pr-10">
                <span class="avatar avatar-sm avatar-online">
                  <img src="<?php echo base_url('assets/web/');?>global/portraits/2.jpg" alt="..." />
                  <i></i>
                </span>
              </div>
              <div class="media-body">
                <h6 class="media-heading">Mary Adams</h6>
                <div class="media-meta">
                  <time datetime="2018-06-17T20:22:05+08:00">30 minutes ago</time>
                </div>
                <div class="media-detail">Anyways, i would like just do it</div>
              </div>
            </div>
          </a>
          <a class="list-group-item" href="javascript:void(0)" role="menuitem">
            <div class="media">
              <div class="pr-10">
                <span class="avatar avatar-sm avatar-off">
                  <img src="<?php echo base_url('assets/web/');?>global/portraits/3.jpg" alt="..." />
                  <i></i>
                </span>
              </div>
              <div class="media-body">
                <h6 class="media-heading">Caleb Richards</h6>
                <div class="media-meta">
                  <time datetime="2018-06-17T12:30:30+08:00">12 hours ago</time>
                </div>
                <div class="media-detail">I checheck the document. But there seems</div>
              </div>
            </div>
          </a>
          <a class="list-group-item" href="javascript:void(0)" role="menuitem">
            <div class="media">
              <div class="pr-10">
                <span class="avatar avatar-sm avatar-busy">
                  <img src="<?php echo base_url('assets/web/');?>global/portraits/4.jpg" alt="..." />
                  <i></i>
                </span>
              </div>
              <div class="media-body">
                <h6 class="media-heading">June Lane</h6>
                <div class="media-meta">
                  <time datetime="2018-06-16T18:38:40+08:00">2 days ago</time>
                </div>
                <div class="media-detail">Lorem ipsum Id consectetur et minim</div>
              </div>
            </div>
          </a>
          <a class="list-group-item" href="javascript:void(0)" role="menuitem">
            <div class="media">
              <div class="pr-10">
                <span class="avatar avatar-sm avatar-away">
                  <img src="<?php echo base_url('assets/web/');?>global/portraits/5.jpg" alt="..." />
                  <i></i>
                </span>
              </div>
              <div class="media-body">
                <h6 class="media-heading">Edward Fletcher</h6>
                <div class="media-meta">
                  <time datetime="2018-06-15T20:34:48+08:00">3 days ago</time>
                </div>
                <div class="media-detail">Dolor et irure cupidatat commodo nostrud nostrud.</div>
              </div>
            </div>
          </a>
        </div>
      </div>
    </div>
    <div class="dropdown-menu-footer" role="presentation">
      <a class="dropdown-menu-footer-btn" href="javascript:void(0)" role="button">
        <i class="icon wb-settings" aria-hidden="true"></i>
      </a>
      <a class="dropdown-item" href="javascript:void(0)" role="menuitem">
        See all messages
      </a>
    </div>
  </div>
  </li>
-->


<!-- CHAT
  <li class="nav-item" id="toggleChat">
    <a class="nav-link" data-toggle="site-sidebar" href="javascript:void(0)" title="Chat"
    data-url="../site-sidebar.tpl">
    <i class="icon wb-chat" aria-hidden="true"></i>
  </a>
  </li>
-->

<!--
<li class="nav-item" id="toggleChat">
  <a class="nav-link" data-toggle="site-sidebar" title="Setting Periode Tahun Akademik">
  Tahun Akadmik : </i><?php //echo $_SESSION['session_ta']; ?>
</a>
</li>
-->

<li class="nav-item dropdown">
  <a class="nav-link navbar-avatar" data-toggle="dropdown" href="#" aria-expanded="false"
  data-animation="scale-up" role="button">
  <span class="avatar avatar-online">
    <img src="<?php echo base_url('assets/web/');?>global/portraits/boy.png" alt="...">
    <i></i>
  </span>
</a>
<div class="dropdown-menu" role="menu">
  <!--
  <a class="dropdown-item" href="javascript:void(0)" role="menuitem"><i class="icon wb-user" aria-hidden="true"></i> Profile</a>
  <a class="dropdown-item" href="javascript:void(0)" role="menuitem"><i class="icon wb-payment" aria-hidden="true"></i> Billing</a>
  <a class="dropdown-item" href="javascript:void(0)" role="menuitem"><i class="icon wb-settings" aria-hidden="true"></i> Settings</a>
-->

<a class="dropdown-item" href="<?php echo base_url();?>index.php/user/" role="menuitem"> <?php echo $_SESSION['session_nama'] ?></a>
<div class="dropdown-divider" role="presentation"></div>
<a class="dropdown-item" href="<?php echo base_url();?>index.php/welcome/logout/" role="menuitem"><i class="icon wb-power" aria-hidden="true"></i> Logout</a>
</div>
</li>
</ul>
<!-- End Navbar Toolbar Right -->
</div>
<!-- End Navbar Collapse -->

<!-- Site Navbar Seach -->
<div class="collapse navbar-search-overlap" id="site-navbar-search">
  <form role="search">
    <div class="form-group">
      <div class="input-search">
        <i class="input-search-icon wb-search" aria-hidden="true"></i>
        <input type="text" class="form-control" name="site-search" placeholder="Search...">
        <button type="button" class="input-search-close icon wb-close" data-target="#site-navbar-search"
        data-toggle="collapse" aria-label="Close"></button>
      </div>
    </div>
  </form>
</div>
<!-- End Site Navbar Seach -->
</div>
</nav>

<!--NAVIGATION MENU-->
<div class="site-menubar">
  <ul class="site-menu">
    <?php include"menu.php"; ?>
  </ul>
</div>

<div class="site-gridmenu">
  <div>
    <div>
      <ul>
        <li>
          <a href="../apps/mailbox/mailbox.html">
            <i class="icon wb-envelope"></i>
            <span>Mailbox</span>
          </a>
        </li>
        <li>
          <a href="../apps/calendar/calendar.html">
            <i class="icon wb-calendar"></i>
            <span>Calendar</span>
          </a>
        </li>
        <li>
          <a href="../apps/contacts/contacts.html">
            <i class="icon wb-user"></i>
            <span>Contacts</span>
          </a>
        </li>
        <li>
          <a href="../apps/media/overview.html">
            <i class="icon wb-camera"></i>
            <span>Media</span>
          </a>
        </li>
        <li>
          <a href="../apps/documents/categories.html">
            <i class="icon wb-order"></i>
            <span>Documents</span>
          </a>
        </li>
        <li>
          <a href="../apps/projects/projects.html">
            <i class="icon wb-image"></i>
            <span>Project</span>
          </a>
        </li>
        <li>
          <a href="../apps/forum/forum.html">
            <i class="icon wb-chat-group"></i>
            <span>Forum</span>
          </a>
        </li>
        <li>
          <a href="../index.html">
            <i class="icon wb-dashboard"></i>
            <span>Dashboard</span>
          </a>
        </li>
      </ul>
    </div>
  </div>
</div>


<!-- Page -->
<div class="page">

  <div class="page-content">
    <!-- Panel Modals Styles -->
    <div class="panel">
      <div class="panel-heading">
        <h3 class="panel-title">Checklist</h3>
      </div>

      <div class="panel-body container-fluid">
        <div class="row row-lg">

          <div class="col-xl-12 col-lg-12">
            <!-- Example Basic Modals (Nifty Modals) -->
            <div class="example-wrap">
              <p align="justify">Fill In the Checklist by click button over here...</p>



              <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal" onclick="updateData();" data-whatever="apakah">Fill In the Checklist</button>


              <form role="form" method="post" action="<?php echo base_url()?>index.php/user/simpan_checklist">
                <div class="modal fade modal-3d-sign" id="exampleModal" aria-hidden="true"
                aria-labelledby="exampleModalTitle" role="dialog" tabindex="-1">
                <div class="modal-dialog modal-simple">
                  <div class="modal-content">
                    <div class="modal-header">
                      <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">×</span>
                      </button>
                      <h4 class="modal-title">Fill In the Checklist</h4>
                    </div>
                    <div class="modal-body">

                      <!-- ISIAN KUISIONER -->
                      <?php
                      $cek = count($jenis_cacat);
                      if ($cek==0) {
                       ?>
                       <p>Anda belum bisa memulai pengisian checklist harian. Silahkan mengisi daftar checklist terlebih dahulu <a href="<?php echo base_url()?>index.php/user/jenis_cacat/">Disini</a></p>
                       <?php
                     }else if ($cek!=0) {
                       ?>
                       <h4 class="example-title">Tanggal Periksa</h4>
                       <input id="tanggal_periksa" name="tanggal_periksa" class="form-control" type="date" value="<?php echo date("Y-m-d") ?>" required>
                       <br>
                       <?php
                     }
                     ?>

                     <?php $no=1; foreach ($jenis_cacat as $d) {
                      ?>
                      <h5 title="<?php echo $d['deskripsi_cacat'] ?>" ><?php echo "[".$no."."."] ".$d['nama_cacat']?></h5>
                      <input hidden type="text" name="id_jenis_cacat[]" value="<?php echo $d['id_jenis_cacat'] ?>">
                      <input name="frekuensi[]" maxlength="3" type="text" required="required" class="form-control" placeholder="Masukkan Banyaknya Cacat"/>
                      <?php $no=$no+1;
                    } ?>

                   

                  </div>
                  <!-- -->
                  <div class="modal-footer">
                    <?php
                    $cek = count($jenis_cacat);
                    if ($cek==0) {
                           //
                    }else if ($cek!=0) {
                     ?>
                     <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                     <button type="submit" class="btn btn-primary">Save changes</button>
                     <?php
                   }
                   ?>

                 </div>

               </div>
             </div>
           </div>
         </form>

         <script>
          function updateData(){
            $('#exampleModal').on('show.bs.modal', function (event) {
                    var button = $(event.relatedTarget) // Button that triggered the modal
                    <?php foreach ($thead as $th) {
                      ?>
                      var <?php echo $th['column_name']?> = button.data('<?php echo $th['column_name']?>') // trim dl
                      <?php
                    } ?>

                    var modal = $(this)
                    modal.find('.modal-title').text('SK Yudisium Prodi ' + jenjang + prodi)
                    <?php foreach ($thead as $th) {
                      ?>
                      modal.find('.modal-body #<?php echo $th['column_name']?>').val(<?php echo $th['column_name']?>)
                      <?php
                    } ?>

                  })
          }
        </script>

              <!--
              <pre>
              <?php print_r($thead) ?>
              <br><br><br>
            -->
            
            <!-- -->



            

            <script>
              function myFunction(name, value){
                if (name=='nidn_pembimbing_1') {
                  document.getElementById("nama_pembimbing_1").value = value;
                }else if(name=='nidn_pembimbing_2'){
                  document.getElementById("nama_pembimbing_2").value = value;
                }
              }

            </script>

          </div>
        </div>

        
      </div>


    </div>
  </div>


  <div class="panel">

      <!-- Panel Basic -->
      <div class="panel">
        <header class="panel-heading">
          <div class="panel-actions"></div>
          <h3 class="panel-title">Pareto Chart Data [ This Month ( <?php echo date('F') ?> ) ]</h3>
        </header>
        <div class="panel-body">

          <style>
            table {
              border-collapse: collapse;
              width: 100%;
              border: 1px solid #ddd;
              font-size: 11.2px;
            }
          </style>

          <div style="overflow-x:auto;">
            <!--<table class="table table-hover dataTable table-striped w-full" data-plugin="dataTable" >-->
              <div align="right">
                <a href="<?php echo base_url()?>index.php/user/paretodiagram" class="btn btn-primary btn-sm">Look table with diagram and sort them</a>
              </div>
              <div align="center">( Days of This Month )</div>
              <table class="table table-hover dataTable table-striped w-full">
                <thead>
                  <tr>
                    <th>No</th>
                    <th>Defect Name</th>
                    <?php
                    $kalender = CAL_GREGORIAN;
                    $bulan = date('m');
                    $tahun = date('Y');
                    $hari = cal_days_in_month($kalender, $bulan, $tahun);

                    $loop = '';

                    for ($i=1; $i <= $hari ; $i++) { 
                      ?><th><?php echo $i ?></th><?php
                    }
                    ?>
                    <th>Frequency</th>
                    <th>Percentage</th>
                    <th>Komulatif</th>
                  </tr>
                </thead>
              <!--
                <tfoot>
                  <tr>
                    <th>No</th>
                    <th>Pertanyaan</th>
                    <th>Hari 1</th>
                    <th>Hari 2</th>
                    <th>Hari 3</th>
                    <th>Frekuensi</th>
                  </tr>
                </tfoot>
              -->
              <tbody>
                <?php $komulatif=0; $no=1; foreach ($pivotable as $pv) {
                  ?>
                  <tr>
                    <td><?php echo $no ?></td>
                    <td><?php echo $pv['jenis_cacat'] ?></td>

                    <?php
                    $kalender = CAL_GREGORIAN;
                    $bulan = date('m');
                    $tahun = date('Y');
                    $hari = cal_days_in_month($kalender, $bulan, $tahun);

                    $loop = '';

                    for ($i=1; $i <= $hari ; $i++) { 
                      ?><td><?php echo $pv["tg_".$i] ?></td><?php
                    }
                    ?>


                    <td><?php echo $pv['frekuensi'] ?></td>
                    <td><?php echo number_format(($pv['frekuensi']/ $total_frekuensi[0]['total_frekuensi'])*100,2) ?> % </td>
                    <td>
                      <?php
                         if ($pv === end($pivotable)){
                            echo '-';
                         }else{
                            $komulatif =  $komulatif + ($pv['frekuensi']/ $total_frekuensi[0]['total_frekuensi']*100);
                            echo number_format($komulatif,2)." %";
                         }
                      ?>
                        
                      </td>
                  </tr>
                  <?php $no++;
                } ?>

              </tbody>
            </table>
          </div>
          
          <hr>

          <h4>Table Reference</h4>
          <table class="table table-hover dataTable table-striped w-full">
            <thead>
              <th>No</th>
              <th>Defect Name</th>
              <th>Defect Description</th>
            </thead>
            <?php $no=1; foreach ($jenis_cacat as $jc) {
              ?>
                <tr>
                  <td><?php echo $no; ?></td>
                  <td><?php echo $jc['nama_cacat'] ?></td>
                  <td><?php echo $jc['deskripsi_cacat'] ?></td>
                </tr>
              <?php $no++;
            } ?>
            
          </table>

        </div>
      </div>
      <!-- End Panel Basic -->

  </div>
  <!-- End Panel Modals Styles -->


</div>
</div>
<!-- End Page -->


<!-- Footer -->
<footer class="site-footer">
  <div class="site-footer-legal">LPMP © 2019 Seven Tools</div>
  <div class="site-footer-right">
    Supported by <i class="red-600 wb wb-heart"></i> by <a href="https://play.google.com/store/apps/developer?id=EllStudiosApp">EllStudiosApp</a>
  </div>
</footer>

<!-- Core  -->
<script src="<?php echo base_url('assets/web/');?>global/vendor/babel-external-helpers/babel-external-helpers599c.js?v4.0.2"></script>
<script src="<?php echo base_url('assets/web/');?>global/vendor/jquery/jquery.min599c.js?v4.0.2"></script>
<script src="<?php echo base_url('assets/web/');?>global/vendor/popper-js/umd/popper.min599c.js?v4.0.2"></script>
<script src="<?php echo base_url('assets/web/');?>global/vendor/bootstrap/bootstrap.min599c.js?v4.0.2"></script>
<script src="<?php echo base_url('assets/web/');?>global/vendor/animsition/animsition.min599c.js?v4.0.2"></script>
<script src="<?php echo base_url('assets/web/');?>global/vendor/mousewheel/jquery.mousewheel599c.js?v4.0.2"></script>
<script src="<?php echo base_url('assets/web/');?>global/vendor/asscrollbar/jquery-asScrollbar.min599c.js?v4.0.2"></script>
<script src="<?php echo base_url('assets/web/');?>global/vendor/asscrollable/jquery-asScrollable.min599c.js?v4.0.2"></script>

<!-- Plugins -->
<script src="<?php echo base_url('assets/web/');?>global/js/Plugin/select2.min599c.js?v4.0.2"></script>

<script src="<?php echo base_url('assets/web/');?>global/vendor/jquery-mmenu/jquery.mmenu.min.all599c.js?v4.0.2"></script>
<script src="<?php echo base_url('assets/web/');?>global/vendor/switchery/switchery.min599c.js?v4.0.2"></script>
<script src="<?php echo base_url('assets/web/');?>global/vendor/intro-js/intro.min599c.js?v4.0.2"></script>
<script src="<?php echo base_url('assets/web/');?>global/vendor/screenfull/screenfull599c.js?v4.0.2"></script>
<script src="<?php echo base_url('assets/web/');?>global/vendor/slidepanel/jquery-slidePanel.min599c.js?v4.0.2"></script>

<!-- Plugins For This Page -->
<script src="<?php echo base_url('assets/web/');?>global/vendor/datatables.net/jquery.dataTables599c.js?v4.0.2"></script>
<script src="<?php echo base_url('assets/web/');?>global/vendor/datatables.net-bs4/dataTables.bootstrap4599c.js?v4.0.2"></script>
<script src="<?php echo base_url('assets/web/');?>global/vendor/datatables.net-fixedheader/dataTables.fixedHeader.min599c.js?v4.0.2"></script>
<script src="<?php echo base_url('assets/web/');?>global/vendor/datatables.net-fixedcolumns/dataTables.fixedColumns.min599c.js?v4.0.2"></script>
<script src="<?php echo base_url('assets/web/');?>global/vendor/datatables.net-rowgroup/dataTables.rowGroup.min599c.js?v4.0.2"></script>
<script src="<?php echo base_url('assets/web/');?>global/vendor/datatables.net-scroller/dataTables.scroller.min599c.js?v4.0.2"></script>
<script src="<?php echo base_url('assets/web/');?>global/vendor/datatables.net-responsive/dataTables.responsive.min599c.js?v4.0.2"></script>
<script src="<?php echo base_url('assets/web/');?>global/vendor/datatables.net-responsive-bs4/responsive.bootstrap4.min599c.js?v4.0.2"></script>
<script src="<?php echo base_url('assets/web/');?>global/vendor/datatables.net-buttons/dataTables.buttons.min599c.js?v4.0.2"></script>
<script src="<?php echo base_url('assets/web/');?>global/vendor/datatables.net-buttons/buttons.html5.min599c.js?v4.0.2"></script>
<script src="<?php echo base_url('assets/web/');?>global/vendor/datatables.net-buttons/buttons.flash.min599c.js?v4.0.2"></script>
<script src="<?php echo base_url('assets/web/');?>global/vendor/datatables.net-buttons/buttons.print.min599c.js?v4.0.2"></script>
<script src="<?php echo base_url('assets/web/');?>global/vendor/datatables.net-buttons/buttons.colVis.min599c.js?v4.0.2"></script>
<script src="<?php echo base_url('assets/web/');?>global/vendor/datatables.net-buttons-bs4/buttons.bootstrap4.min599c.js?v4.0.2"></script>
<script src="<?php echo base_url('assets/web/');?>global/vendor/asrange/jquery-asRange.min599c.js?v4.0.2"></script>
<script src="<?php echo base_url('assets/web/');?>global/vendor/bootbox/bootbox.min599c.js?v4.0.2"></script>

<!-- Scripts -->
<script src="<?php echo base_url('assets/web/');?>global/js/Component.min599c.js?v4.0.2"></script>
<script src="<?php echo base_url('assets/web/');?>global/js/Plugin.min599c.js?v4.0.2"></script>
<script src="<?php echo base_url('assets/web/');?>global/js/Base.min599c.js?v4.0.2"></script>
<script src="<?php echo base_url('assets/web/');?>global/js/Config.min599c.js?v4.0.2"></script>

<script src="<?php echo base_url('assets/web/');?>assets/js/Section/Menubar.min599c.js?v4.0.2"></script>
<script src="<?php echo base_url('assets/web/');?>assets/js/Section/Sidebar.min599c.js?v4.0.2"></script>
<script src="<?php echo base_url('assets/web/');?>assets/js/Section/PageAside.min599c.js?v4.0.2"></script>
<script src="<?php echo base_url('assets/web/');?>assets/js/Section/GridMenu.min599c.js?v4.0.2"></script>
<!-- Config -->
<script src="<?php echo base_url('assets/web/');?>global/js/config/colors.min599c.js?v4.0.2"></script>
<script src="<?php echo base_url('assets/web/');?>assets/js/config/tour.min599c.js?v4.0.2"></script>
<script>
  Config.set('assets', '../assets');
</script>

<!-- Page -->
<script src="<?php echo base_url('assets/web/');?>assets/js/Site.min599c.js?v4.0.2"></script>
<script src="<?php echo base_url('assets/web/');?>global/js/Plugin/asscrollable.min599c.js?v4.0.2"></script>
<script src="<?php echo base_url('assets/web/');?>global/js/Plugin/slidepanel.min599c.js?v4.0.2"></script>
<script src="<?php echo base_url('assets/web/');?>global/js/Plugin/switchery.min599c.js?v4.0.2"></script>

<script src="<?php echo base_url('assets/web/');?>/assets/examples/js/forms/advanced.min599c.js?v4.0.2"></script>


<script>
  (function(document, window, $) {
    'use strict';

    var Site = window.Site;
    $(document).ready(function() {
      Site.run();
    });
  })(document, window, jQuery);
</script>


</body>


<!-- Mirrored from getbootstrapadmin.com/remark/mmenu/uikit/modals.html by HTTrack Website Copier/3.x [XR&CO'2014], Fri, 10 May 2019 07:47:26 GMT -->
</html>