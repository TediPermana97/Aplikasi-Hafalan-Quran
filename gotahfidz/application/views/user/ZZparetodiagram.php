<!DOCTYPE html>
<html class="no-js css-menubar" lang="en">

<!-- Mirrored from getbootstrapadmin.com/remark/mmenu/tables/datatable.html by HTTrack Website Copier/3.x [XR&CO'2014], Fri, 10 May 2019 07:48:10 GMT -->
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimal-ui">
  <meta name="description" content="bootstrap admin template">
  <meta name="author" content="">

  <title>DataTables | Remark Admin Template</title>

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
  <link rel="stylesheet" href="<?php echo base_url('assets/web/');?>assets/examples/css/tables/datatable.min599c.css?v4.0.2">

  <!-- Fonts -->
  <link rel="stylesheet" href="<?php echo base_url('assets/web/');?>global/fonts/web-icons/web-icons.min599c.css?v4.0.2">
  <link rel="stylesheet" href="<?php echo base_url('assets/web/');?>global/fonts/brand-icons/brand-icons.min599c.css?v4.0.2">
  <link rel='stylesheet' href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,300italic">

  <link rel="stylesheet" href="<?php echo base_url('assets/web/');?>global/fonts/font-awesome/font-awesome.min599c.css?v4.0.2">

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
        <span class="navbar-brand-text hidden-xs-down"> Remark</span>
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


      </ul>
      <!-- End Navbar Toolbar -->

      <!-- Navbar Toolbar Right -->
      <ul class="nav navbar-toolbar navbar-right navbar-toolbar-right">

        <li class="nav-item dropdown">
          <a class="nav-link navbar-avatar" data-toggle="dropdown" href="#" aria-expanded="false"
          data-animation="scale-up" role="button">
          <span class="avatar avatar-online">
            <img src="<?php echo base_url('assets/web/');?>global/portraits/boy.png" alt="...">
            <i></i>
          </span>
        </a>
        <div class="dropdown-menu" role="menu">
          <a class="dropdown-item" href="javascript:void(0)" role="menuitem"><?php echo $_SESSION['session_nama']?></a>
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
          <a href="<?php echo base_url('assets/web/');?>apps/mailbox/mailbox.html">
            <i class="icon wb-envelope"></i>
            <span>Mailbox</span>
          </a>
        </li>
        <li>
          <a href="<?php echo base_url('assets/web/');?>apps/calendar/calendar.html">
            <i class="icon wb-calendar"></i>
            <span>Calendar</span>
          </a>
        </li>
        <li>
          <a href="<?php echo base_url('assets/web/');?>apps/contacts/contacts.html">
            <i class="icon wb-user"></i>
            <span>Contacts</span>
          </a>
        </li>
        <li>
          <a href="<?php echo base_url('assets/web/');?>apps/media/overview.html">
            <i class="icon wb-camera"></i>
            <span>Media</span>
          </a>
        </li>
        <li>
          <a href="<?php echo base_url('assets/web/');?>apps/documents/categories.html">
            <i class="icon wb-order"></i>
            <span>Documents</span>
          </a>
        </li>
        <li>
          <a href="<?php echo base_url('assets/web/');?>apps/projects/projects.html">
            <i class="icon wb-image"></i>
            <span>Project</span>
          </a>
        </li>
        <li>
          <a href="<?php echo base_url('assets/web/');?>apps/forum/forum.html">
            <i class="icon wb-chat-group"></i>
            <span>Forum</span>
          </a>
        </li>
        <li>
          <a href="<?php echo base_url('assets/web/');?>index.html">
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

    <!-- Panel Table Tools -->
    <div class="panel">
      <header class="panel-heading">
        <h3 class="panel-title">Table Tools</h3>
      </header>

      <style>
        table {
          border-collapse: collapse;
          width: 100%;
          border: 1px solid #ddd;
          font-size: 12px;
        }
      </style>
      
      <div style="overflow-x:auto;">
        <table class="table table-hover dataTable table-striped w-full" id="exampleTableTools">
          <thead>
            <tr>
              <th>No</th>
              <th>Description ID</th>
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
            </tr>
          </thead>
          <tfoot>
            <tr>
              <th>No</th>
              <th>Description ID</th>
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
            </tr>
          </tfoot>
          <tbody>
            <?php $no=1; foreach ($pivotable as $pv) {
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
              </tr>
              <?php $no++;
            } ?>

          </tbody>
        </table>
      </div>
    </div>
  </div>
  <!-- End Panel Table Tools -->

</div>
</div>
<!-- End Page -->


<!-- Footer -->
<footer class="site-footer">
  <div class="site-footer-legal">© 2018 <a href="https://themeforest.net/item/remark-responsive-bootstrap-admin-template/11989202">Remark</a></div>
  <div class="site-footer-right">
    Crafted with <i class="red-600 wb wb-heart"></i> by <a href="https://themeforest.net/user/creation-studio">Creation Studio</a>
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

<script src="<?php echo base_url('assets/web/');?>global/js/Plugin/datatables.min599c.js?v4.0.2"></script>


<script src="<?php echo base_url('assets/web/');?>assets/examples/js/tables/datatable.min599c.js?v4.0.2"></script>


<!-- Google Analytics -->
<script>
  (function(i, s, o, g, r, a, m) {
    i['GoogleAnalyticsObject'] = r;
    i[r] = i[r] || function() {
      (i[r].q = i[r].q || []).push(arguments)
    }, i[r].l = 1 * new Date();
    a = s.createElement(o),
    m = s.getElementsByTagName(o)[0];
    a.async = 1;
    a.src = g;
    m.parentNode.insertBefore(a, m)
  })(window, document, 'script', '../../../../www.google-analytics.com/analytics.js',
  'ga');

  ga('create', 'UA-65522665-1', 'auto');
  ga('send', 'pageview');
</script>
</body>


<!-- Mirrored from getbootstrapadmin.com/remark/mmenu/tables/datatable.html by HTTrack Website Copier/3.x [XR&CO'2014], Fri, 10 May 2019 07:48:10 GMT -->
</html>