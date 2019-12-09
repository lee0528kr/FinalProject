
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="robots" content="noindex, nofollow"> 

    <title>Responsive login with social buttons - Bootsnipp.com</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <script src="//code.jquery.com/jquery-1.10.2.min.js"></script>
    <link media="all" type="text/css" rel="stylesheet" href="https://bootsnipp.com/css/fullscreen.css">

</head>
<body>
    <div id="toolbar">
        Theme: 
        <select class="form-control" name="bootstrap-theme" id="theme_chooser">
          <option value="">Plain Bootstrap</option><option value="//maxcdn.bootstrapcdn.com/bootswatch/3.3.0/amelia/bootstrap.min.css">Amelia</option><option value="//maxcdn.bootstrapcdn.com/bootswatch/3.3.0/cerulean/bootstrap.min.css">Cerulean</option><option value="//maxcdn.bootstrapcdn.com/bootswatch/3.3.0/cosmo/bootstrap.min.css">Cosmo</option><option value="//maxcdn.bootstrapcdn.com/bootswatch/3.3.0/cyborg/bootstrap.min.css">Cyborg</option><option value="//maxcdn.bootstrapcdn.com/bootswatch/3.3.0/flatly/bootstrap.min.css">Flatly</option><option value="//maxcdn.bootstrapcdn.com/bootswatch/3.3.0/journal/bootstrap.min.css">Journal</option><option value="//maxcdn.bootstrapcdn.com/bootswatch/3.3.0/lumen/bootstrap.min.css">Lumen</option><option value="//maxcdn.bootstrapcdn.com/bootswatch/3.3.0/readable/bootstrap.min.css">Readable</option><option value="//maxcdn.bootstrapcdn.com/bootswatch/3.3.0/simplex/bootstrap.min.css">Simplex</option><option value="//maxcdn.bootstrapcdn.com/bootswatch/3.3.0/slate/bootstrap.min.css">Slate</option><option value="//maxcdn.bootstrapcdn.com/bootswatch/3.3.0/spacelab/bootstrap.min.css">Spacelab</option><option value="//maxcdn.bootstrapcdn.com/bootswatch/3.3.0/superhero/bootstrap.min.css">Superhero</option><option value="//maxcdn.bootstrapcdn.com/bootswatch/3.3.0/united/bootstrap.min.css">United</option><option value="//maxcdn.bootstrapcdn.com/bootswatch/3.3.0/yeti/bootstrap.min.css">Yeti</option><option value="//maxcdn.bootstrapcdn.com/bootswatch/3.3.0/darkly/bootstrap.min.css">Darkly</option>
        </select>
                <a href="https://bootsnipp.com/snippets/OW8E" class="btn btn-default">View on Bootsnipp.com</a>
                <a class="btn btn-default" href="close" onclick="window.close();return false;">&times;</a>
    </div>

    <iframe id="snippet-preview" src="//s.bootsnipp.com/iframe/OW8E" frameborder='no'></iframe>

    <script type="text/javascript">
    var _gaq = _gaq || [];
    _gaq.push(['_setAccount', 'UA-34731274-1']);
    _gaq.push(['_trackPageview']);
    _gaq.push(['_trackEvent', 'sharing', 'viewed full-screen', 'snippet OW8E',0,true]);
    (function() {
      var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
      ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
      var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
    })();
    </script>
    <script type="text/javascript">
    (function($) { 
        $('#theme_chooser').change(function(){
            whichCSS = $(this).val();
            document.getElementById('snippet-preview').contentWindow.changeCSS(whichCSS);
        });
    })(jQuery);
    </script>
</body>
</html>
