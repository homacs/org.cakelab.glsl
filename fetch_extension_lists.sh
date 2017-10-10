#!/bin/bash
#
#
# This script fetches lists of names of all approved OpenGL extensions into files:
#  - ARB_extensions.txt
#  - GL_extensions.txt
#  - ES_extensions.txt
#
# After reviewing(!) those files are supposed to be copied into the package 
#   org.cakelab.glsl.builtins.extensions
#
# To (instead) fetch all extension specifications (text files) use the following command:
#         wget -r -np -nH http://www.khronos.org/registry/OpenGL
#



function fetch () {
	url="$1"
	fout="$2"
	wget $url -O - 2>/dev/null | grep "href" |                                      \
		awk '/<li.*/{gsub(".*\\.txt\">","") ; gsub("</a>", "") ; printf "\n" $0 ; } \
			 /<br.*/{gsub(".*\\.txt\">","") ; gsub("</a>", "") ; printf " " $0 ; }' \
		> "$fout" || echo "error fetching extension names from $url"
	count=`cat $fout | wc -l`
	if [ $count -eq 0 ] ; then 
		echo "error: list of extensions is empty"
	else
		echo "successfully fetched $count extension names into file '$fout'"
	fi
}


fetch "https://www.khronos.org/registry/OpenGL/extensions/arbext.php"    "ARB_extensions.txt"
fetch "https://www.khronos.org/registry/OpenGL/extensions/glext.php"     "GL_extensions.txt"
fetch "https://www.khronos.org/registry/OpenGL/extensions/esext.php"     "ES_extensions.txt"
