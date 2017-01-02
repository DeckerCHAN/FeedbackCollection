/**
 * Created by DeckerCHAN on 12/31/2016.
 */
(function () {
    window.system = {};
    var system = window.system;

    system.getUrlArguments = function () {
        // This function is anonymous, is executed immediately and
        // the return value is assigned to QueryString!
        var query_string = {};
        var query = window.location.search.substring(1);
        var vars = query.split("&");
        for (var i = 0; i < vars.length; i++) {
            var pair = vars[i].split("=");
            // If first entry with this name
            if (typeof query_string[pair[0]] === "undefined") {
                query_string[pair[0]] = decodeURIComponent(pair[1]);
                // If second entry with this name
            } else if (typeof query_string[pair[0]] === "string") {
                query_string[pair[0]] = [query_string[pair[0]], decodeURIComponent(pair[1])];
                // If third or later entry with this name
            } else {
                query_string[pair[0]].push(decodeURIComponent(pair[1]));
            }
        }
        return query_string;
    };

    system.getReportCode = function () {
        return window.system.getUrlArguments()["uid"];
    };




    system.templates = {};

    system.templates.singleSelect = {};

    system.templates.singleSelect.getSingleSelectHTML = function (title, options) {

    };


})(jQuery);
